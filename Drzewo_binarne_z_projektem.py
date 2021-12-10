from typing import Any, Callable, List


class BinaryNode:
    value: Any
    left_child: 'BinaryNode'
    right_child: 'BinaryNode'

    def __init__(self, value: Any) -> None:
        self.value = value
        self.left_child = None
        self.right_child = None

    def __str__(self) -> str:
        return self.value

    def is_leaf(self) -> bool:
        if self.right_child is None and self.left_child is None:
            return True
        return False

    def add_left_child(self, value: Any) -> None:
        if self.left_child is None:
            self.left_child = BinaryNode(value)

    def add_right_child(self, value: Any) -> None:
        if self.right_child is None:
            self.right_child = BinaryNode(value)

    def traverse_in_order(self, visit: Callable[[Any], None]) -> None:
        if self.left_child is not None:
            self.left_child.traverse_in_order(visit)
        visit(self.value)
        if self.right_child is not None:
            self.right_child.traverse_in_order(visit)

    def traverse_post_order(self, visit: Callable[[Any], None]) -> None:
        if self.left_child is not None:
            self.left_child.traverse_post_order(visit)
        if self.right_child is not None:
            self.right_child.traverse_post_order(visit)
        visit(self.value)

    def traverse_pre_order(self, visit: Callable[[Any], None]) -> None:
        visit(self.value)
        if self.left_child is not None:
            self.left_child.traverse_pre_order(visit)
        if self.right_child is not None:
            self.right_child.traverse_pre_order(visit)

    def show(self, level=0) -> None:
        if self.right_child is not None:
            self.right_child.show(level+1)
        if level == 0:
            print(' ', self.value)
        else:
            print(' ' * 4 * level + '-->', self.value)
        if self.left_child is not None:
            self.left_child.show(level+1)

    def right_line(self, zwrot: List[Any], level=0) -> None:
        if level > len(zwrot)-1:
            zwrot.append(self.value)
        if self.right_child is not None:
            self.right_child.right_line(zwrot, level+1)
        if self.left_child is not None:
            self.left_child.right_line(zwrot, level+1)

class BinaryTree:
    root: BinaryNode

    def __init__(self, value: Any):
        self.root = BinaryNode(value)

    def traverse_in_order(self, visit: Callable[[Any], None]) -> None:
        self.root.traverse_in_order(visit)

    def traverse_post_order(self, visit: Callable[[Any], None]) -> None:
        self.root.traverse_post_order(visit)

    def traverse_pre_order(self, visit: Callable[[Any], None]) -> None:
        self.root.traverse_pre_order(visit)

    def show(self) -> None:
        self.root.show()

def right_line(tree: BinaryTree) -> List[BinaryNode]:
    lista = []
    tree.root.right_line(zwrot=lista)
    return lista


tree = BinaryTree(1)
tree.root.add_right_child(3)
tree.root.right_child.add_right_child(7)
tree.root.add_left_child(2)
tree.root.left_child.add_left_child(4)
tree.root.left_child.add_right_child(5)
tree.root.left_child.left_child.add_left_child(8)
tree.root.left_child.left_child.add_right_child(9)
tree.show()
print(right_line(tree))

