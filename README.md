
# Spring Dependency Injection Examples

This repository demonstrates two fundamental types of Dependency Injection in Spring using object-type injection:

- **Setter-based Dependency Injection**
- **Constructor-based Dependency Injection**

## 📘 About

Dependency Injection (DI) is a key concept in Spring Framework that allows objects to define their dependencies through external configuration instead of creating them internally. This leads to loosely coupled and more testable code.

This project includes simple examples using a `Student` class that depends on an `Address` class to showcase both DI methods.

---

## 🧱 Project Structure

```

.
├── src/
│   ├── Student.java
│   ├── Address.java
│   ├── Test.java
└── applicationContext.xml

````

---

## 📌 Features

### ✅ Setter-based Injection
- `Student` class includes a setter method for injecting an `Address` object.
- Configuration is handled via `applicationContext.xml`.

### ✅ Constructor-based Injection
- `Student` class also provides a constructor for injecting the `Address` object.
- Spring container uses the constructor to instantiate the bean.

---

## ⚙ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/spring-di-example.git
   cd spring-di-example
````

2. Open the project in your preferred IDE (e.g., Eclipse, IntelliJ).

3. Add the Spring library to the classpath.

4. Run the `Test.java` file.

---

## 📄 Sample Bean Configuration (applicationContext.xml)

```xml
<bean id="address" class="com.example.Address">
    <property name="city" value="Pune"/>
    <property name="state" value="Maharashtra"/>
</bean>

<!-- Setter Injection -->
<bean id="studentSetter" class="com.example.Student">
    <property name="name" value="Rutika"/>
    <property name="address" ref="address"/>
</bean>

<!-- Constructor Injection -->
<bean id="studentConstructor" class="com.example.Student">
    <constructor-arg value="Rutika"/>
    <constructor-arg ref="address"/>
</bean>
```

---

## 🎯 Output

Upon running the `Test` class, you will see the student name and their corresponding address displayed in the console, proving that the dependency has been successfully injected.

---

## 📚 Topics Covered

* Spring Core
* Bean Configuration
* Object Dependency Injection
* XML-based Configuration

---

## 👩‍💻 Author

**Rutika Chaugale**
Training & Placement Solutions


---

## 🏷️ Tags

`#SpringCore` `#DependencyInjection` `#SetterInjection` `#ConstructorInjection` `#Java` `#SpringFramework`
