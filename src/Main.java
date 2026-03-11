import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        //int[] arr = {10, 8, 3, 1, 19, 4, 0};

        //oddiy bubble sort asosida sortlashni ko'rib chiqamiz

        //{10, 8, 3, 1, 19, 4, 0}, i = 0
        //{8, 10, 3, 1, 19, 4, 0}, i = 0
        //{3, 10, 8, 1, 19, 4, 0}, i = 0
        //{1, 10, 8, 3, 19, 4, 0}, i = 0
        //{0, 10, 8, 3, 19, 4, 1}, i = 0

        //{0, 10, 8, 3, 19, 4, 1}, i = 1
        //{0, 8, 10, 3, 19, 4, 1}, i = 1
        //{0, 3, 10, 8, 19, 4, 1}, i = 1
        //{0, 1, 10, 8, 19, 4, 3}, i = 1

        //{0, 1, 10, 8, 19, 4, 3}, i = 2
        //{0, 1, 8, 10, 19, 4, 3}, i = 2
        //{0, 1, 4, 10, 19, 8, 3}, i = 2
        //{0, 1, 3, 10, 19, 8, 4}, i = 2

        //{0, 1, 3, 10, 19, 8, 4}, i = 3
        //{0, 1, 3, 8, 19, 10, 4}, i = 3
        //{0, 1, 3, 4, 19, 10, 8}, i = 3

        //{0, 1, 3, 4, 19, 10, 8}, i = 4
        //{0, 1, 3, 4, 8, 19, 10}, i = 4

        //{0, 1, 3, 4, 8, 19, 10}, i = 5
        //{0, 1, 3, 4, 8, 10, 19}, i = 5

        //{0, 1, 3, 4, 8, 10, 19}, i = 6 (cycle has been ended, we don't need to continue at a time)

        //{0, 1, 3, 4, 8, 10, 19}

        /*int[] arr = {10, 8, 3, 1, 19, 4, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        */
        //yuqorida biz sonlarni oddiy qo'lda o'sish yoki kamayish tartibida tartibladik
        // Shunaqa holatlar ko'p sodir bo'laverganidan keyin javachilar kelinglar shuni bitta yordamchi class ochib yozib qo'yaylik deyishgan
        // va shunaqa qilishgan

        /*int[] numbers = {1, 8, 5, 2, 12, 7};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));*/

        /*String[] arr = {"Alish", "Valish", "Donni", "Tolib"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        Student s1 = new Student(18, "Nodirbek");
        Student s2 = new Student(17, "Lazizbek");
        Student s3 = new Student(19, "Toshmat");
        Student s4 = new Student(17, "Eshmat");
        Student[] students = {s1, s2, s3, s4};

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = 0;
                if (o1.getAge() > o2.getAge()) {
                    result = -1;
                } else if (o1.getAge() < o2.getAge()) {
                    result = 1;
                }

                System.out.println("o1 = " + o1 + ", o2 = " + o2 + ", result = " + result);
                return result;
            }
        };

        Arrays.sort(students, comparator);
        System.out.println(Arrays.toString(students));
    }
}