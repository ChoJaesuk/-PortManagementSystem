import java.io.*;
import java.util.Scanner;

public class User {
    private String userName;
    private String password;
    private String role;
    public User(){
        role = null;
        userName = null;
        password = null;
    }
    public User(String role,String userName, String password) throws IOException {
        this.role = role;
        this.userName = userName;
        this.password = password;
        if(role == "admin"){
            saveAdmin();
        } else if (role == "portmanager") {
            savePortManager();
        }
    }
    private void saveAdmin() throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter("/src/Data/admin.txt", true));
        output.println(this.role + " " + this.userName + " " + this.password);
        output.flush();
        output.close();
    }
    private void savePortManager() throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter("/src/Data/PortManager.txt", true));
        output.println(this.role + " " + this.userName + " " + this.password);
        output.flush();
        output.close();

    }
//    public void loadUser(){
//                Object obj = null;
//        ArrayList<Student> studentList = new ArrayList<Student>();
//        FileInputStream fi = new FileInputStream("students.obj");
//        ObjectInputStream studentIn = new ObjectInputStream(fi);
//        while (true) {
//            try {
//                obj = studentIn.readObject();
//                studentList.add((Student) obj);
//            } catch (EOFException e) {
//                System.out.println("Finished reading all the objects!!!");
//                break;
//            }
//        }
//        for (Student s: studentList){
//            System.out.println(s.getName() + " " + s.getMajor() + " " + s.getGpa());
//        }
//    }

}
