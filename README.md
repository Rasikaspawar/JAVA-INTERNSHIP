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
       Task 5 (Banking Account Simulation)

This is a simple Java project I created for my internship task. It simulates a bank account using OOP concepts like classes, inheritance, and method overriding.

### Features:
- Deposit money 
- Withdraw money 


### Files:
- `Account.java` – main class with deposit/withdraw logic
- `SavingsAccount.java` – extends Account and adds interest
- `Main.java` – contains the menu and runs the app

- OOP concepts (inheritance, overriding, encapsulation)
- How to manage account balance and history
- Writing clean and menu-based Java code.
======================================================================================
************(TASK6)(TODO LIST)*************
  * import javax.swing.*;
This line imports everything you need from the Swing library for GUI.
*JFrame frame = new JFrame("My To-Do List"); 
	- Set window title.
 *Step 1: Create the main window (a frame)
     *   JFrame frame = new JFrame("My To-Do List"); 
	- Set window title
     *   frame.setSize(300, 400); 
	-Set window width and height
      *  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	- Close app when window is closed.
*Step 2: Create a text field where you type the task
       *  JTextField taskField = new JTextField(); 
	- Empty text box for entering a task.
*Step 3: Create a list model to store tasks, and a JList to show them
       * DefaultListModel<String> listModel = new DefaultListModel<>(); 
	- Holds list data
        *JList<String> taskList = new JList<>(listModel); 
	-Shows the tasks on the screen
 *Step 4: Create Add and Delete buttons
       * JButton addButton = new JButton("Add"); 
	- Button to add task
        *JButton deleteButton = new JButton("Delete"); 
	-Button to delete selected task
* Step 5:  when the "Add" button is clicked
        addButton.addActionListener(e -> {
            *String task = taskField.getText(); 
	- Get text from the input box
            *if (!task.isEmpty()) {
	 - If it's not empty
                *listModel.addElement(task); 
	- Add the task to the list
                *taskField.setText(""); 
	- Clear the input box
            }
        });
** Step 6:  when the "Delete" button is clicked
       * deleteButton.addActionListener(e -> {
          *  int selected = taskList.getSelectedIndex(); 
	- Get selected task index
            *if (selected != -1) { 
	-If a task is selected
                *listModel.remove(selected); 
	- Remove that task from the list
            }
        });
*Step 7: Create a panel to hold the input field and buttons
        *JPanel topPanel = new JPanel(); 
	-A small container to group items horizontally
        *topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
 	- Arrange side by side
       * topPanel.add(taskField); 
	- Add input box to panel
       * topPanel.add(addButton); 
	- Add add button to panel
       * topPanel.add(deleteButton); 
	- Add delete button to panel
* Step 8: Set layout of the window and add components
       * frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS)); 
	- Stack things vertically
       * frame.add(topPanel); 
		-Add top panel to window
       * frame.add(new JScrollPane(taskList)); 
	-Add task list with scroll bar to window
* Step 9: Show the window on screen
       * frame.setVisible(true); 
	- Make the window visible
    }
}
*****DESCRIPATION SHORT*********
*JFrame is used for Creates the main window.
*JTextField is used Input box for typing a task.
*DefaultListModel & JList is used for Stores and displays tasks.
*JButton is used for  Add/Delete tasks..
*addActionListener is used for Tells Java what to do when a button is clicked.
*JPanel is used for Holds input box and buttons side-by-side.
*BoxLayout is used for Arranges items vertically or horizontally.
*JScrollPanel is used for Makes the task list scrollable if it's long.

=========================================================================================
         
