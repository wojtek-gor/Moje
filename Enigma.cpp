#include<iostream>
#include<conio.h>
//odwzorowanie pierwszej wersji enigmy sil londowych
using namespace std;
int WirnikI=0;//ustawienie wirników zalerzy od u¿ytkownika
int WirnikII=0;//Moze przyjac jedna z 26 pozycji
int WirnikIII=0;//wirnik obracajacy jest staly
int tabwirI[]={4,10,12,5,11,6,3,16,21,25,13,19,14,22,24,7,23,20,18,15,0,8,1,17,2,9};
int tabwirII[]={0,9,3,10,18,8,17,20,23,1,11,7,22,19,12,2,16,6,25,13,15,24,5,21,14,4};
int tabwirIII[]={1,3,5,7,9,11,2,15,17,19,23,21,25,13,24,4,8,22,6,0,10,12,20,18,16,14};
int tabwirobr[]={24,17,20,7,16,18,11,3,15,23,13,6,14,10,12,8,4,1,5,25,2,22,21,9,0,19};
char tab[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
void wirnikI(int znak);//wirniki enigmy
void wirnikII(int znak);
void wirnikIII(int znak);
void wirnik_odwracajacy(int znak);//wirnik odwracajacy sygnal
void wirnikIIIp(int znak);//wirniki po permutacji, wynik dzialania dwustronnosci wirników
void wirnikIIp(int znak);
void wirnikIp(int znak);
int main()
{
    char znak;
    int i;
    cout<<"Uruchomiles enigme."<<endl;
    cout<<"Ustaw pierwszy wirnik(wpisz znak od a do z): ";
    cin>>znak;
    for(i=0;i<26;i++)
    {
        if(tab[i]==znak)
        {
            WirnikI=i;
            break;
        }
    }
    cout<<"Ustaw drugi wirnik(wpisz znak od a do z): ";
    cin>>znak;
    for(i=0;i<26;i++)
    {
        if(tab[i]==znak)
        {
            WirnikII=i;
            break;
        }
    }
    cout<<"Ustaw trzeci wirnik(wpisz znak od a do z): ";
    cin>>znak;
    cout<<"Znak kropki wylacza enigme"<<endl;
    for(i=0;i<26;i++)
    {
        if(tab[i]==znak)
        {
            WirnikIII=i;
            break;
        }
    }
    cout<<"Rozpocznij szyfrowanie wiadomosci: "<<endl;
    while(true)
    {
        nowa:
        znak=getch();
        WirnikI++;
        if(WirnikI%26==0)
            WirnikII++;
        if(WirnikII%26==0 && WirnikI%26==0)
            WirnikIII++;
        if(znak=='.')
            break;
        else
        {
            for(i=0;i<26;i++)
            {
                if(tab[i]==znak)
                    break;
            }

            wirnikI(i);
        }
    }
    return 0;
}
void wirnikI(int znak)//wirniki enigmy
{
    wirnikII(tabwirI[znak]);
}
void wirnikII(int znak)
{
    int znak2=((znak-WirnikI)+WirnikII)%26;
    if(znak2<0)
        znak2=znak2+26;
    wirnikIII(tabwirII[znak2]);
}
void wirnikIII(int znak)
{
    int znak2=((znak-WirnikII)+WirnikIII)%26;
    if(znak2<0)
        znak2=znak2+26;
    wirnik_odwracajacy(tabwirIII[znak2]);
}
void wirnik_odwracajacy(int znak)//wirnik odwracajacy sygnal
{
    int znak2=(znak-WirnikIII)%26;
        if(znak2<0)
        znak2=znak2+26;
    wirnikIIIp(tabwirobr[znak2]);
}
void wirnikIIIp(int znak)//wirniki po permutacji, wynik dzialania dwustronnosci wirników
{
    int i;
    int znak2=(znak+WirnikIII)%26;
    for(i=0;i<26;i++)
    {
        if(tabwirIII[i]==znak2)
            break;
    }
    wirnikIIp(i);
}
void wirnikIIp(int znak)
{
    int i;
    int znak2=((znak+WirnikII)-WirnikIII)%26;
    if(znak2<0)
        znak2=znak2+26;
    for(i=0;i<26;i++)
    {
        if(tabwirII[i]==znak2)
            break;
    }
    wirnikIp(i);
}
void wirnikIp(int znak)
{
    int i;
    int znak2=((znak+WirnikI)-WirnikII)%26;
    if(znak2<0)
        znak2=znak2+26;
    for(i=0;i<26;i++)
    {
        if(tabwirI[i]==znak2)
            break;
    }
    cout<<'\r'<<tab[i];
}
