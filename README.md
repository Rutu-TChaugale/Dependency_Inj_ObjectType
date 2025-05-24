
# Spring Dependency Injection Examples

This repository demonstrates two core types of Dependency Injection in Spring using object-type injection:

- **Setter-based Dependency Injection**
- **Constructor-based Dependency Injection**

---

## 📘 About

Dependency Injection (DI) is a fundamental principle of the Spring Framework that allows objects to receive their dependencies from an external source (like the Spring container), rather than creating them internally.

This project uses a `Student` class dependent on an `Address` class to show how both setter-based and constructor-based injection work.

---

## 🧱 Project Structure

```

.
├── src/
│   ├── client/
│   │   └── Test.java
│   ├── model/
│   │   ├── Student.java
│   │   └── Address.java
└── applicationContext.xml

````


## 📌 Features

### ✅ Setter-based Injection
- The `Student` bean is injected with the `Address` bean using a setter method.

### ✅ Constructor-based Injection
- The `Student` bean receives its dependencies through the constructor.

---

## ⚙ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/spring-di-example.git
   cd spring-di-example


2. Open the project in your IDE (like IntelliJ or Eclipse).

3. Ensure Spring Core libraries are in your classpath.

4. Run `Test.java` from the `client` package.

---

## 📄 Sample Bean Configuration (applicationContext.xml)

```xml
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
                           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- Address Bean -->
    <bean id="address" class="model.Address">
        <property name="city" value="Pune"/>
        <property name="state" value="Maharashtra"/>
    </bean>

    <!-- Setter Injection -->
    <bean id="studentSetter" class="model.Student">
        <property name="name" value="Rutika"/>
        <property name="address" ref="address"/>
    </bean>

    <!-- Constructor Injection -->
    <bean id="studentConstructor" class="model.Student">
        <constructor-arg value="Rutika"/>
        <constructor-arg ref="address"/>
    </bean>

</beans>
---



## 🎯 Output

When running the `Test` class, Spring will inject the `Address` object into `Student`, and print the student name and address, proving successful DI.


## 📚 Topics Covered

* Spring Core
* Bean Configuration via XML
* Object-based DI
* Setter vs Constructor Injection
* Java Classes and Beans

---

## 👩‍💻 Author

**Rutika Chaugale**

---

## 🏷️ Tags

`#SpringCore` `#DependencyInjection` `#SetterInjection` `#ConstructorInjection` `#Java` `#SpringFramework` `#SkillsITAcademy`


