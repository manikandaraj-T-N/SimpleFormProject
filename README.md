# Simple Form Project


## Description

The Simple Form project is a web application that allows users to submit a form with their first name, last name, and password. The submitted data is then inserted into a MySQL database. This project serves as a basic example of how to handle form submission and database operations in a Java web application.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Technologies Used](#technologies-used)
- [Running with Tomcat](#running-with-tomcat)
- [License](#license)
- [Contributing](#contributing)
- [Contact](#contact)

## Installation

To run this project locally, follow these steps:

1. Ensure you have Eclipse IDE for Java and a MySQL server installed on your system.
  
  - Create a new project in Eclipse: Open Eclipse IDE and create a new Java project by going to File -> New -> Java Project. Give your project a suitable name.

  - Copy the Java code: Create a new package within your project by right-clicking on the project folder, selecting New -> Package, and providing a package name (e.g.,     p1). Inside the package, create a new Java class file (e.g., Form.java) and copy the Java code you provided into that file.

  - Copy the HTML code: Create a new HTML file (e.g., index.html) by right-clicking on the project folder, selecting New -> File, and providing the file name. Copy the     HTML code you provided into that file.

  - Set up MySQL Connector/J library: Download the MySQL Connector/J JAR file from the official MySQL website (https://dev.mysql.com/downloads/connector/j/). Save the    JAR file to a location on your computer.

  - Add the MySQL Connector/J library to the project: In Eclipse, right-click on your project, select Build Path -> Configure Build Path. In the dialog that opens, go     to the Libraries tab and click on the Add External JARs button. Browse to the location where you saved the MySQL Connector/J JAR file, select it, and click Open to     add it to your project's classpath.

  - Configure project settings: Right-click on your project, select Properties, and go to the Java Build Path section. Make sure the MySQL Connector/J JAR file is         listed under the Libraries tab.

  - Run the project: Right-click on the Form.java file, select Run As -> Java Application. This will compile and execute the Java code, launching the embedded Tomcat       server and making the web application accessible at http://localhost:8080.

  - Remember to set up the MySQL database as described in the previous instructions and update the database connection parameters in the Form.java file if necessary.

  - Additionally, make sure you have the necessary MySQL server installed and running on your local machine before running the project.

  - Once you have completed these steps, you should be able to run the project and access the form through a web browser.

2. Clone or download this repository to your local machine.

3. Import the project into Eclipse:
   - Open Eclipse IDE.
   - Select `File -> Import`.
   - Choose `Existing Projects into Workspace` and click `Next`.
   - Browse to the project directory and select it.
   - Click `Finish` to import the project.

4. Set up the MySQL database:
   - Create a database named `form` in your MySQL server.
   - Update the database connection parameters in the `Form.java` file if necessary.

5. Configure the project:
   - Right-click on the project in Eclipse and select `Build Path -> Configure Build Path`.
   - Go to the `Libraries` tab and ensure that the MySQL Connector/J JAR file is included.

6. Start the Apache Tomcat server:
   - Make sure the Tomcat server is properly installed and configured on your machine.
   - Start the Tomcat server by running the appropriate startup script or using the server's administration console.

7. Deploy the project to Tomcat:
   - Right-click on the project in Eclipse and select `Run As -> Run on Server`.
   - Choose the configured Tomcat server and click `Finish`.
   - Eclipse will deploy the project to the Tomcat server.

8. Run the project:
   - Right-click on the `Form.java` file and select `Run As -> Run on server`.
   - This will compile and execute the Java code, launching the embedded Tomcat server.
   - The web application will be accessible at `http://localhost:8080`.

## Usage

To use the Simple Form project:

1. Open a web browser and navigate to `http://localhost:8080` to access the form.

2. Fill in the required fields: first name, last name, and password.

3. Click the `Submit` button to submit the form.

4. If the form submission is successful, the submitted data will be inserted into the MySQL database.

## Technologies Used

- Java
- MySQL
- HTML
- Eclipse IDE
- Apache Tomcat 9 or later version

## License

This project is licensed under the [MIT License](https://opensource.org/license/mit/).

## Contributing

Contributions are welcome! If you would like to contribute to this project, please follow these steps:

1. Fork the repository.

2. Create a new branch for your feature or bug fix.

3. Make your changes in the branch.

4. Commit your changes with descriptive commit messages.

5. Push your branch to your forked repository.

6. Submit a pull request detailing your changes.

Please ensure that your code adheres to the existing coding standards and conventions used in the project.

## Contact

If you have any questions, suggestions, or would like to report a bug, please feel free to contact Manikandaraj via [manikandarajnataraj@gmail.com].

