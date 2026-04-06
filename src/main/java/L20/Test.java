package L20;

public class Test {
    static class Student {
        private StringBuilder name;
        private int grade;
        private int course;

        public StringBuilder getName() {
            return name;
        }

        public void setName(StringBuilder name) {
            if (name.length() < 3) {
                throw new RuntimeException("Ошибка! Имя студента не может быть меньше 3 символов");
            }
            this.name = name;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            if (grade < 1) {
                throw new RuntimeException("Ошибка! Оценка студента не может быть меньше 1");
            }
            if (grade > 10) {
                throw new RuntimeException("Ошибка! Оценка студента не может быть больше 10");
            }
            this.grade = grade;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            if (course < 1) {
                throw new RuntimeException("Ошибка! Курс студента не может быть меньше 1");
            }
            if (course > 4) {
                throw new RuntimeException("Ошибка! Курс студента не может быть больше 4");
            }
            this.course = course;
        }

        @Override
        public String toString() {
            return "Name = " + this.name + " grade = " + this.grade + " course = " + this.course;
        }

        public static void showInfo(Student student) {
            System.out.println(student.toString());
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Name"));
        student.setGrade(1);
        student.setCourse(4);
        Student.showInfo(student);
    }
}
