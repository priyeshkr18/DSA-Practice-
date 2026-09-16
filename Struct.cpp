// // // #include <bits/stdc++.h> //struct is a real world entity
// // // using namespace std;
// // // struct Student
// // // {
// // // 	int rollNo;
// // // 	string name;
// // // 	int age;
// // // 	float marks;
// // // };

// // // int main()
// // // {
// // // 	Student s1;
// // // 	s1.rollNo = 25;
// // // 	s1.name = "Priyesh";
// // // 	s1.age = 24;
// // // 	s1.marks = 25.5;
// // // 	cout << s1;
// // // }
// // #include <iostream>
// // #include <string>
// // using namespace std;

// // struct Student
// // {
// // 	int rollNo;
// // 	string name;
// // 	int age;
// // 	float marks;
// // };

// // int main()
// // {
// // 	Student s1;

// // 	s1.rollNo = 25;
// // 	s1.name = "Priyesh";
// // 	s1.age = 24;
// // 	s1.marks = 25.5;

// // 	cout << "Roll No: " << s1.rollNo << endl;
// // 	cout << "Name: " << s1.name << endl;
// // 	cout << "Age: " << s1.age << endl;
// // 	cout << "Marks: " << s1.marks << endl;

// // 	return 0;
// // }

// #include <iostream>
// #include <string>
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

// 	cout << "Enter Roll No: ";
// 	cin >> s1.rollNo;

// 	cout << "Enter Name: ";
// 	cin >> s1.name;

// 	cout << "Enter Age: ";
// 	cin >> s1.age;

// 	cout << "Enter Marks: ";
// 	cin >> s1.marks;

// 	cout << "\n--- Student Details ---" << endl;
// 	cout << "Roll No: " << s1.rollNo << endl;
// 	cout << "Name: " << s1.name << endl;
// 	cout << "Age: " << s1.age << endl;
// 	cout << "Marks: " << s1.marks << endl;

// 	return 0;
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

	// Take input
	cout << "Enter Roll No: ";
	cin >> s1.rollNo;

	cin.ignore(); // Clear leftover Enter key

	cout << "Enter Name: ";
	getline(cin, s1.name);

	cout << "Enter Age: ";
	cin >> s1.age;

	cout << "Enter Marks: ";
	cin >> s1.marks;

	// Print details
	cout << "\n--- Student Details ---" << endl;
	cout << "Roll No: " << s1.rollNo << endl;
	cout << "Name: " << s1.name << endl;
	cout << "Age: " << s1.age << endl;
	cout << "Marks: " << s1.marks << endl;

	return 0;
}