package task0;

public class Students {
    int id = 0;
    String name;
    String lastName;
    String fullName;
    String dateOfBirth;
    String adress;
    String phoneAtributes;
    Integer phone ;
    String faculty;
    int course;
    int group = 0;

    public Students(int id, String name, String lastName, String fullName, String dateOfBirth,
                         String adress, String phoneAtributes, Integer phone, String faculty, int course, int group) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.adress = adress;
        this.phoneAtributes = phoneAtributes;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    Students (){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneAtributes() {
        return phoneAtributes;
    }

    public void setPhoneAtributes(String phoneAtributes) {
        this.phoneAtributes = phoneAtributes;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", adress='" + adress + '\'' +'\n'+
                ", phoneAtributes='" + phoneAtributes + '\'' +
                ", phone=" + phone +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}'+'\n';
    }
}
