// #include <bits/stdc++.h> //struct is a real world entity
// using namespace std;
// struct Student
// {
// 	int rollNo;
// 	string name;
// 	int age;
// 	float marks;
// };

// int main()
// {
// 	Student s1;
// 	s1.rollNo = 25;
// 	s1.name = "Priyesh";
// 	s1.age = 24;
// 	s1.marks = 25.5;
// 	cout << s1;
// }
#include <iostream>
#include <string>
using namespace std;

struct Student
{
	int rollNo;
	string name;
	int age;
	float marks;
};

int main()
{
	Student s1;

	s1.rollNo = 25;
	s1.name = "Priyesh";
	s1.age = 24;
	s1.marks = 25.5;

	cout << "Roll No: " << s1.rollNo << endl;
	cout << "Name: " << s1.name << endl;
	cout << "Age: " << s1.age << endl;
	cout << "Marks: " << s1.marks << endl;

	return 0;
}