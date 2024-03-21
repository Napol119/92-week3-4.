package student;

public class Student {

    private String stdName, stdID;

    public Student() {
        stdName = "Unknown";
        stdID = "xxx";
    }

    public void setStdName(String name) {
        stdName = name;
    }

    public void setStdID(String id) { // เปลี่ยนพารามิเตอร์เป็น String
        stdID = id;
    }

    public String getLogin(String id) {
        stdID = id.substring(2); // แก้ substring ให้ตัดตั้งแต่ index 2 ไปจนถึงจุดสุดท้ายของ id
        return stdID;
    }

    public String getPassword() {
        return stdName.substring(0, 3) + stdID.substring(0, 4); // แก้ substring ให้เอา 4 ตัวแรกของ stdID
    }
}
