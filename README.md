# 📂 JAVA ANNOTATIONS & CLASS HIERARCHIES - EXERCISES PROJECT

## 📄 PROJECT DESCRIPTION

This project explores **Java annotations**, **custom annotation creation**, and **object-oriented principles** like inheritance, method overriding, and the use of deprecated methods. It progresses through multiple levels, introducing annotation handling and Java Reflection.

---

## 🔹 KEY FEATURES

- ✔ Inheritance with method overriding  
- ✔ Use of `@Override` and `@Deprecated` annotations  
- ✔ Suppression of warnings using `@SuppressWarnings`  
- ✔ Creation of custom annotations  
- ✔ Writing objects to JSON using annotations  
- ✔ Use of Java Reflection API to read runtime annotations  

---

## 💻 TECHNOLOGIES USED

- ✔ Java 17+  
- ✔ Eclipse / IntelliJ IDEA  
- ✔ JDK & JRE  
- ✔ Git & GitHub for version control
- Maven

---

## 📋 REQUIREMENTS

- ✔ Use **Eclipse** or **IntelliJ IDEA**  
- ✔ Java Development Kit (JDK) 17+  
- ✔ Allowed to use Java, Maven, or Gradle  
- ✔ Ensure clean and maintainable code structure

---

## 🛠️ INSTALLATION & SETUP

1️⃣ Clone the repository:

```bash
git clone <https://github.com/FlavioKde/S107javaAnnotations.git
>
2️⃣ Navigate to the project directory:

bash
Copiar
Editar
cd Java-Annotations-Exercises
3️⃣ Open the project in your IDE of choice (Eclipse or IntelliJ)

4️⃣ Compile and run exercises from the src directory

▶️ EXECUTION INSTRUCTIONS
🔹 LEVEL 1: CLASS INHERITANCE & ANNOTATIONS
✔ Exercise 1: Worker Class Hierarchy
Create a class hierarchy with:

Worker (base class)

OnlineWorker (subclass)

OnsiteWorker (subclass)

Common attributes: name, surname, hourlyRate

Override calculateSalary(int hoursWorked) in both subclasses using @Override

Additional logic:

OnsiteWorker: adds static gasoline bonus to salary

OnlineWorker: adds constant internetFee to salary

📌 Run:

bash
Copiar
Editar
java -cp target/classes level1.exercise1.Main
✔ Exercise 2: Deprecated Methods
Add deprecated methods in both subclasses using @Deprecated

From an external class, invoke these methods

Use @SuppressWarnings("deprecation") to ignore warnings when calling them

📌 Run:

bash
Copiar
Editar
java -cp target/classes level1.exercise2.MainDeprecated
🔹 LEVEL 2: CUSTOM ANNOTATION
✔ Exercise 1: JSON Serialization Annotation
Create a custom annotation that accepts a path to store a JSON file

Apply it to classes intended for serialization

Implement logic that reads this annotation and writes the object to the specified JSON file

📌 Run:

bash
Copiar
Editar
java -cp target/classes level2.exercise1.MainCustomAnnotation
🔹 LEVEL 3: RUNTIME ANNOTATION PROCESSING
✔ Exercise 1: Runtime Reflection
Extend the annotation from Level 2 so it's available at runtime

Use Java Reflection API to:

Detect annotated classes at runtime

Automatically trigger serialization

📌 Run:

bash
Copiar
Editar
java -cp target/classes level3.exercise1.MainReflection
🌐 DEPLOYMENT
✔ Ensure proper class hierarchy and package naming

✔ Annotations must be correctly defined and retained at runtime where applicable

✔ Always test annotation-based logic using reflection carefully

✔ Avoid hardcoded paths—use relative paths or configuration files when possible

🤝 CONTRIBUTIONS
Contributions are welcome! Follow these steps:

1️⃣ Fork the repository
2️⃣ Create a feature branch:

bash
Copiar
Editar
git checkout -b feature/YourFeature
3️⃣ Commit your changes:

bash
Copiar
Editar
git commit -m "Add feature: Custom runtime annotations"
4️⃣ Push to your fork:

bash
Copiar
Editar
git push origin feature/YourFeature
5️⃣ Open a Pull Request

📌 NOTES
✔ Follow Java naming conventions and clean code guidelines

✔ Prefer constants and enums where applicable

✔ Make sure to test deprecated methods in isolation

✔ Use Java Reflection cautiously — ensure performance and security aren't compromised

🚀 HAPPY CODING & GOOD LUCK ON YOUR LEARNING JOURNEY! ✨
