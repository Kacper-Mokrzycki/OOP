#include <iostream>
using namespace std;

class Student {
  public:
    int index;
    string name;
    string lastname;
    int age;
    int group_number;

    void Show_Student_stats(){
        cout << "Studnet index" << Student::index << endl;
        cout << "Studnet name" << Student::name << endl;
        cout << "Studnet lastname" << Student::lastname << endl;
        cout << "Studnet age" << Student::age << endl;
        cout << "Studnet group_number" << Student::group_number << endl;
    }
};

class Obj_Lab_group {
    public:
    int group_number;
    Student Studend_indexes[16];
};



class Subject {
    public:
    string title;
    int difficulty;
    string teacher;
    int ECTS;
};

int main(){

  Student StudObj1;
  StudObj1.index = 151894;
  StudObj1.name = "Kacper";
  StudObj1.lastname = "Mokrzycki";
  StudObj1.age = 20;
  StudObj1.group_number = 13;

  Student StudObj2;
  StudObj2.index = 151913;
  StudObj2.name = "Jan";
  StudObj2.lastname = "Kowalski";
  StudObj2.age = 23;
  StudObj1.group_number = 13;

  Subject Programowanie_niskopoziomowe;
  Programowanie_niskopoziomowe.title = "Programowanie_niskopoziomowe";
  Programowanie_niskopoziomowe.difficulty = 6;
  Programowanie_niskopoziomowe.teacher = "Piotr Nowicki";
  Programowanie_niskopoziomowe.ECTS = 4;

  Obj_Lab_group group1;
  group1.group_number = 13;
  group1.Studend_indexes[0] = StudObj1;
  group1.Studend_indexes[1] = StudObj2;

    cout <<"All students and their stats\n" << endl;
        for (int i = 0; i <2; i++){
            cout << "Student "  << i+1 << endl; 
            StudObj1.Show_Student_stats();
            cout << endl;
        }
return 0;
};