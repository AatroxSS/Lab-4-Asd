import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Петренко", "Олена", 203, "ФІОТ"),
                new Student("Іваненко", "Іван", 101, "ФПМ"),
                new Student("Сидоренко", "Марія", 203, "ФІОТ"),
                new Student("Коваленко", "Андрій", 102, "ФЕЛ"),
                new Student("Шевченко", "Тарас", 101, "ФПМ"),
                new Student("Бондаренко", "Оксана", 205, "ФІОТ"),
                new Student("Лисенко", "Микола", 102, "ФЕЛ"),
                new Student("Мельник", "Вікторія", 205, "ФІОТ")
        };

        System.out.println("========== ДО СОРТУВАННЯ (ЗА НОМЕРОМ ГРУПИ) ==========");
        printStudents(students);
        insertionSortByGroup(students);

        System.out.println("\n========== ПІСЛЯ СОРТУВАННЯ (ЗА НОМЕРОМ ГРУПИ) ==========");
        printStudents(students);
    }

    public static void insertionSortByGroup(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getGroupNumber() > key.getGroupNumber()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printStudents(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
