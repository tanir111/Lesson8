import java.util.Arrays;



    public class Student implements Comparable
    {
        public int student_id;
        public String last_name;
        public String first_name;

        public Student(int student_id, String last_name, String first_name)
        {
            this.student_id = student_id;
            this.last_name = last_name;
            this.first_name = first_name;
        }

        /* Перегрузка метода compareTo */

        public int compareTo(Object obj)
        {
            Student tmp = (Student)obj;
            if(this.student_id < tmp.student_id)
            {
                /* текущее меньше полученного */
                return -1;
            }
            else if(this.student_id > tmp.student_id)
            {
                /* текущее больше полученного */
                return 1;
            }
            /* текущее равно полученному */
            return 0;
        }




    public static void main(String[] args)
    {
        /* Создание массива объектов Student */

        Student[] students = new Student[3];
        students[0] = new Student(2,"Smith","Bob");
        students[1] = new Student(3,"Jones","Will");
        students[2] = new Student(1,"Johnson","Matt");

        /* Сортировка массива */
        Arrays.sort(students);

        /* Печать отсортированных значений */

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].student_id +
                    students[i].last_name + students[i].first_name);
        }
    }

    }

