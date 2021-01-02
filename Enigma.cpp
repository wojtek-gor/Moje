#include<iostream>
#include<conio.h>
#include<windows.h>
//odwzorowanie ENIGMY
using namespace std;
void wirnikI(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], int tabwirIII[], int tabwirobr[], char tab[]);//wirniki enigmy
void wirnikII(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], int tabwirIII[], int tabwirobr[], char tab[]);
void wirnikIII(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], int tabwirIII[], int tabwirobr[], char tab[]);
void wirnik_odwracajacy(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], int tabwirIII[], int tabwirobr[], char tab[]);//wirnik odwracajacy sygnal
void wirnikIIIp(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], int tabwirIII[], char tab[]);//wirniki po permutacji, wynik dzialania dwustronnosci wirników
void wirnikIIp(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], char tab[]);
void wirnikIp(int znak, int WirnikI, int WirnikII, int tabwirI[], char tab[]);
int main()
{
    int WirnikI=0;//ustawienie wirników zalerzy od u¿ytkownika
    int WirnikII=0;//Moze przyjac jedna z 26 pozycji
    int WirnikIII=0;//wirnik obracajacy jest staly
    int tabwirI[]={4,10,12,5,11,6,3,16,21,25,13,19,14,22,24,7,23,20,18,15,0,8,1,17,2,9};
    int tabwirII[]={0,9,3,10,18,8,17,20,23,1,11,7,22,19,12,2,16,6,25,13,15,24,5,21,14,4};
    int tabwirIII[]={1,3,5,7,9,11,2,15,17,19,23,21,25,13,24,4,8,22,6,0,10,12,20,18,16,14};
    int tabwirIV[]={4,18,14,21,15,25,9,0,24,16,20,8,17,7,23,11,13,5,19,6,10,3,2,12,22,1};
    int tabwirobr[]={24,17,20,7,16,18,11,3,15,23,13,6,14,10,12,8,4,1,5,25,2,22,21,9,0,19};
    char tab[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char znak;
    int i,ustwir, wybor;
    cout<<"Uruchomiles enigme."<<endl;
    cout<<"Wybierz pierwszy wirnik: ";
    while(true)
    {
        ustwir=getch()%48;
        if(ustwir>=1 && ustwir<=4)
        {
            cout<<ustwir<<endl;
            ustwir=ustwir*100;
            break;
        }
        else
        {
            cout<<ustwir<<endl<<"Blad, wprowadz poprawne dane: ";
        }
    }
    cout<<"Wybierz drugi wirnik: ";
    while(true)
    {
        wybor=getch()%48;
        if(ustwir/100!=wybor && wybor>=1 && wybor<=4)
        {
            cout<<wybor<<endl;
            ustwir=ustwir+wybor*10;
            break;
        }
        else
        {
            cout<<wybor<<endl<<"Blad, wprowadz poprawne dane: ";
        }
    }
    cout<<"Wybierz trzeci wirnik: ";
    while(true)
    {
       wybor=getch()%48;
       if((ustwir-ustwir%100)/100!=wybor && (ustwir%100)/10!=wybor && wybor>=1 && wybor<=4 )
       {
           cout<<wybor<<endl;
           ustwir=ustwir+wybor;
           break;
       }
       else
       {
           cout<<wybor<<endl<<"Blad, wprowadz poprawne dane: ";
       }
    }
    cout<<"Ustaw pierwszy wirnik(wpisz znak od a do z): ";
    while(true)
    {
        znak=getch();
        if(znak>='a' && znak<='z')
        {
            break;
        }
        else
            cout<<endl<<"Zly znak, wprowadz poprawne dane: ";
    }
    cout<<znak<<endl;
    for(i=0;i<26;i++)
    {
        if(tab[i]==znak)
        {
            WirnikI=i;
            break;
        }
    }
    cout<<"Ustaw drugi wirnik(wpisz znak od a do z): ";
    while(true)
    {
        znak=getch();
        if(znak>='a' && znak<='z')
        {
            break;
        }
        else
            cout<<endl<<"Zly znak, wprowadz poprawne dane: ";
    }
    cout<<znak<<endl;
    for(i=0;i<26;i++)
    {
        if(tab[i]==znak)
        {
            WirnikII=i;
            break;
        }
    }
    cout<<"Ustaw trzeci wirnik(wpisz znak od a do z): ";
    while(true)
    {
        znak=getch();
        if(znak>='a' && znak<='z')
        {
            break;
        }
        else
            cout<<endl<<"Zly znak, wprowadz poprawne dane: ";
    }
    cout<<znak<<endl;
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
        while(true)
    {
        znak=getch();
        if(znak>='a' && znak<='z' || znak=='.')
        {
            break;
        }
        else
            cout<<'\r'<<"Zly znak, wprowadz poprawne dane: "<<endl;
    }
        WirnikI++;
        if(WirnikI%26==0 || WirnikI%26==13)
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
            switch(ustwir)
            {
            case 123:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirI,tabwirII,tabwirIII,tabwirobr, tab);
                break;
            case 124:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirI,tabwirII,tabwirIV,tabwirobr, tab);
                break;
            case 132:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirI,tabwirIII,tabwirII,tabwirobr, tab);
                break;
            case 134:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirI,tabwirIII,tabwirIV,tabwirobr, tab);
                break;
            case 143:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirI,tabwirIV,tabwirIII,tabwirobr, tab);
                break;
            case 142:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirI,tabwirIV,tabwirII,tabwirobr, tab);
                break;
            case 213:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirII,tabwirI,tabwirIII,tabwirobr, tab);
                break;
            case 214:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirII,tabwirI,tabwirIV,tabwirobr, tab);
                break;
            case 231:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirII,tabwirIII,tabwirI,tabwirobr, tab);
                break;
            case 234:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirII,tabwirIII,tabwirIV,tabwirobr, tab);
                break;
            case 241:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirII,tabwirIV,tabwirI,tabwirobr, tab);
                break;
            case 243:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirII,tabwirIV,tabwirIII,tabwirobr, tab);
                break;
            case 312:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIII,tabwirI,tabwirII,tabwirobr, tab);
                break;
            case 314:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIII,tabwirI,tabwirIV,tabwirobr, tab);
                break;
            case 321:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIII,tabwirII,tabwirI,tabwirobr, tab);
                break;
            case 324:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIII,tabwirII,tabwirIV,tabwirobr, tab);
                break;
            case 341:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIII,tabwirIV,tabwirI,tabwirobr, tab);
                break;
            case 342:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIII,tabwirIV,tabwirII,tabwirobr, tab);
                break;
            case 412:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIV,tabwirI,tabwirII,tabwirobr, tab);
                break;
            case 413:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIV,tabwirI,tabwirIII,tabwirobr, tab);
                break;
            case 421:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIV,tabwirII,tabwirI,tabwirobr, tab);
                break;
            case 423:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIV,tabwirII,tabwirIII,tabwirobr, tab);
                break;
            case 431:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIV,tabwirIII,tabwirI,tabwirobr, tab);
                break;
            case 432:
                wirnikI(i,WirnikI,WirnikII,WirnikIII,tabwirIV,tabwirIII,tabwirII,tabwirobr, tab);
                break;
            }
        }
    }
    cout<<"Zamykam enigme.";
    Sleep(3000);
    return 0;
}
void wirnikI(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], int tabwirIII[], int tabwirobr[], char tab[])//wirniki enigmy
{
    wirnikII(tabwirI[znak], WirnikI, WirnikII, WirnikIII, tabwirI, tabwirII, tabwirIII, tabwirobr,tab);
}
void wirnikII(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], int tabwirIII[], int tabwirobr[], char tab[])
{
    int znak2=((znak-WirnikI)+WirnikII)%26;
    if(znak2<0)
        znak2=znak2+26;
    wirnikIII(tabwirII[znak2], WirnikI, WirnikII, WirnikIII, tabwirI, tabwirII, tabwirIII, tabwirobr,tab);
}
void wirnikIII(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], int tabwirIII[], int tabwirobr[], char tab[])
{
    int znak2=((znak-WirnikII)+WirnikIII)%26;
    if(znak2<0)
        znak2=znak2+26;
    wirnik_odwracajacy(tabwirIII[znak2], WirnikI, WirnikII, WirnikIII, tabwirI, tabwirII, tabwirIII, tabwirobr,tab);
}
void wirnik_odwracajacy(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], int tabwirIII[], int tabwirobr[], char tab[])//wirnik odwracajacy sygnal
{
    int znak2=(znak-WirnikIII)%26;
        if(znak2<0)
        znak2=znak2+26;
    wirnikIIIp(tabwirobr[znak2], WirnikI, WirnikII, WirnikIII, tabwirI, tabwirII, tabwirIII, tab);
}
void wirnikIIIp(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], int tabwirIII[], char tab[])//wirniki po permutacji, wynik dzialania dwustronnosci wirników
{
    int i;
    int znak2=(znak+WirnikIII)%26;
    for(i=0;i<26;i++)
    {
        if(tabwirIII[i]==znak2)
            break;
    }
    wirnikIIp(i, WirnikI, WirnikII, WirnikIII, tabwirI, tabwirII,tab);
}
void wirnikIIp(int znak, int WirnikI, int WirnikII, int WirnikIII, int tabwirI[], int tabwirII[], char tab[])
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
    wirnikIp(i, WirnikI, WirnikII, tabwirI,tab);
}
void wirnikIp(int znak, int WirnikI, int WirnikII, int tabwirI[], char tab[])
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
    Sleep(1000);
    cout<<'\r'<<" "<<'\r';
}
