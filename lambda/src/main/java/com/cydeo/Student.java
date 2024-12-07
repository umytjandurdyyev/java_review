package com.cydeo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

// static fields are not initialized
//@NoArgsConstructor
// will not generate constructor argument for the static fields
// will not generate constructor argument for the final fields if they are initialized
@AllArgsConstructor
@Data // @Getter, @Setter, @ToString, @EqualsAndHashCode
// uninitialized final fields and fields with constrains
@RequiredArgsConstructor
public class Student {

    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private final int age;

//    public Student() {
//    }
//
//    public Student(int age, String confirmPassword, String email, String firstname, String lastname, String password, String username) {
//        this.age = age;
//        this.confirmPassword = confirmPassword;
//        this.email = email;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.password = password;
//        this.username = username;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getConfirmPassword() {
//        return confirmPassword;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setConfirmPassword(String confirmPassword) {
//        this.confirmPassword = confirmPassword;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", firstname='" + firstname + '\'' +
//                ", lastname='" + lastname + '\'' +
//                ", username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", confirmPassword='" + confirmPassword + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age && Objects.equals(firstname, student.firstname) && Objects.equals(lastname, student.lastname) && Objects.equals(username, student.username) && Objects.equals(email, student.email) && Objects.equals(password, student.password) && Objects.equals(confirmPassword, student.confirmPassword);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstname, lastname, username, email, password, confirmPassword, age);
//    }
}
