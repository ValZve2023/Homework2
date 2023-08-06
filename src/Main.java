public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        //
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }
    public static void task2() {
        //
        var dog = 8.0;
        dog = dog  + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    public static void task3() {
        //
        var dog = 8.0;
        dog = dog  + 4;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);
    }
    public static void task4() {
        //
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5() {
        //
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6() {
        //
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println(totalWeight);
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println(weightDifference);
    }
    public static void task7() {
        //
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println(weightDifference);
        var weightDifference2 = boxerWeight2 % boxerWeight1;
        System.out.println(weightDifference2);
    }
    public static void task8() {
        //
        var workingHours = 640;
        var employeeTime = 8;
        var employeesNumber = workingHours / employeeTime;
        System.out.println("Всего работников в компании - " + employeesNumber + " человек");
        var moreEmployees = 94;
        var totalEmployeesNumber = employeesNumber + moreEmployees;
        var totalWorkingHours = employeeTime * totalEmployeesNumber;
        System.out.println("Если в компании работает " + totalEmployeesNumber + " человек, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками");
    }
}
