                              TASK 1 (CALCULATOR)

  I am creating calculator using java.
Scanner is used for  input taking from user .
Method for Arithmatic opertions 
Loop (while ) for repeated use.
Switch Statement for menu control
Conditional statements (if,Break)
Basic I/O System.out and System.in is used.
==============================================================================================================================================

                            TASK2(STUDENT RECORD)
      I am using vs code software created this Student record managemnet program is created . this project we can add,remove,update and view the student records. 
      Arraylist is using for Storing stuent data in memory
      we use constructor,getter,setter,toString() all methods to manage and display data
      by using ID of students we can update the student record & delete the student specific data.
=================================================================================================================================================

                                          Task 3(LIBRARY MANAGEMENT SYSTEM)
      Here i am created Library Management system.
1) PERSON.JAVA
       Public Class Person: This is a parent/base class. Both User and Librarian will inherit it.
    * protected string name; - protected allows accesss withinn subclass.
     *Constructuor Person(String name,int id)- used to initialize common properties.
     *displayRole()- This method will be overriden in subclasses to show specific roles.
2)USER.JAVA
      * User extends Person- Inheritance. User inherits from person.
      * super(name,id): calls the constructor of person.
      * @Override - This means displayRole()replaces the parent's version.
3) Librarian .java
      * Similar  to user.java
4) Book.java
       * this class represents a book in the library.
       * title,author,and isIssued  are prviate means encapsulate.
       * Getter methods: getTitle(), isIssued() — allow read access.
       * issueBook() / returnBook() — change book status.
       * displayInfo() — shows the book's details.
5) Library.java
   ArrayList<Book> books — Dynamic list to store all books.
   addBook() — Method Overloading:
         First one creates a Book object using title/author.
         Second one adds an already created Book.
    *viewBooks() — Displays all books in the library.
    *issueBook(title) — Loops through books to find one by title and marks it issued.
    *returnBook(title) — Marks a book as returned if it matches and was issued.
6) Main.java
        *Creates a Library object and a Scanner for user input.
        *user and librarian demonstrate polymorphism with displayRole().
   ==============================================================================================================================
                                       TASK4 ( FILE READ & WRITE)
  * Here i am created File read and write project using following concept
  * FileWriter - To Write notes to file & create file ( and here i am given to my file name is notes.txt so if we are given another name this file then file is not created this logic is used).
  *  FileReader +BufferedReader = To read notes from file.
  *   Try-with-resource- to automatically close files.
  *   Exception handling - Handl IOException, FileNotFoundException.
  *   Scanner - to take user input from console.
  *   do-while loop - to show menu until user choose not "EXIT".
  *   Switch-case - to handle user's choice.
===================================================================================================================================
       
         
