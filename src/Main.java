import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        LinkedList<Integer> numbers = new LinkedList<>();
//        numbers.add(1);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(0);
//        numbers.add(4);
//
//        ListIterator<Integer> integerListIterator =numbers.listIterator();
//
//        while (integerListIterator.hasNext()){
//            System.out.println(numbers);
//        }


//        /**  palindrome */
//        String str = "reader";
//        LinkedList<Character> list = new LinkedList<>();
//        for (char c : str.toLowerCase().toCharArray()) {
//            list.add(c);
//        }
//        ListIterator<Character>iterator = list.listIterator();
//        ListIterator<Character>iterator1 = list.listIterator(list.size());
//
//        boolean trueOfFalse = true;
//        while (iterator.hasNext() && iterator1.hasPrevious()){
//            if(!(iterator.next().equals(iterator1.previous()))){
//                trueOfFalse = false;
//
//            }
//            break;
//        }
//        if(trueOfFalse) System.out.println("Palindrome");
//        else System.out.println("No palindrome");
//
//

//        1. LinkedList тизменин биринчи элементин алуу үчүн Java программасын жазыңыз.
//        LinkedList<Integer> integers = new LinkedList<>();
//        integers.add(4);
//        integers.add(0);
//        integers.add(5);
//        integers.add(6);
//        System.out.println(integers.getFirst());
//
//        2. LinkedList тизменин акыркы элементин алуу үчүн Java программасын жазыңыз.
//        LinkedList<Integer>integers1 = new LinkedList<>();
//        integers1.add(47);
//        integers1.add(0);
//        integers1.add(4);
//        integers1.add(48);
//        System.out.println(integers1.getLast());
//
//        3. LinkedList тизмеде белгилүү бир элемент бар же жок экенин текшерүү үчүн Java программасын жаз.
//        LinkedList<Integer>integers = new LinkedList<>();
//        integers.add(87);
//        integers.add(83);
//        integers.add(0);
//        integers.add(7);
//        System.out.println(integers.contains(0));

//        4. LinkedList тизмени массивдердин тизмесине которуу үчүн Java программасын жазыңыз.
//        LinkedList<String>strings = new LinkedList<>();
//        strings.add("java");
//        strings.add("JS");
//        strings.add("Python");
//        strings.add("c#");
//        strings.add("c++");
//        LinkedList<String>strings1 = new LinkedList<>();
//        strings1.addAll(strings);
//        System.out.println(strings1);

//
//        5. Эки LinkedList тизмесин салыштыруу үчүн Java программасын жазыңыз.
//        LinkedList<String>strings = new LinkedList<>();
//        strings.add("Hello");
//        strings.add("No");
//        strings.add("bye");
//        LinkedList<String>strings1 = new LinkedList<>();
//        strings1.add("Hello");
//        strings1.add("No");
//        strings1.add("bye");
//        System.out.println(strings.equals(strings1));
//
//        6. LinkedList тизме бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
//        LinkedList<Integer> integers = new LinkedList<>();
//        integers.add(4);
//        integers.add(4);
//        integers.add(4);
//        System.out.println(integers.isEmpty());

//
//        7. LinkedList тизмедеги элементти алмаштыруу үчүн Java программасын жазыңыз.
//        Link edList<Integer>integers = new LinkedList<>();
//        integers.add(7);
//        integers.add(0);
//        integers.add(4);
//        integers.set(1,8);
//        System.out.println(integers);
//
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`


// 1
//        Set<BankAccount> stringSet = new HashSet<>(Arrays.asList(
//                new BankAccount("OPTIMA ","111111","123"),
//                new BankAccount("KYRGYZSTAN ","222222","345"),
//                new BankAccount("DEMIR ","333333","678"),
//                new BankAccount("RSK ","444444","91011")
//        ));
//        Set<BankAccount>bankAccounts = new HashSet<>();
//        bankAccounts.addAll(stringSet);
//        System.out.println(bankAccounts);




//2
//        Set<BankAccount>integers = new HashSet<>(Arrays.asList(
//                new BankAccount("OPTIMA ","111111","123"),
//                new BankAccount("KYRGYZSTAN ","222222","345"),
//                new BankAccount("DEMIR ","333333","678"),
//                new BankAccount("RSK ","444444","91011")
//        ));
//
//
//        Iterator<BankAccount> integerIterator = integers.iterator();
//        while (integerIterator.hasNext()) {
//            System.out.println(integerIterator.next());
//        }
 //3
//        Set<Integer>integers = new HashSet<>();
//        integers.add(4);
//        integers.add(8);
//        integers.add(33);
//        integers.add(0);
//        integers.add(6);
//        System.out.println(integers.size());
// 4
//        Set<BankAccount>bankAccounts = new HashSet<>(Arrays.asList(
//                new BankAccount("OPTIMA ","111111","123"),
//                new BankAccount("KYRGYZSTAN ","222222","345"),
//                new BankAccount("DEMIR ","333333","678"),
//                new BankAccount("RSK ","444444","91011"))
//        );
//        bankAccounts.clear();
//        System.out.println(bankAccounts);

//        Set<BankAccount>bankAccounts = new HashSet<>(Arrays.asList(
//                new BankAccount("OPTIMA ","111111","123"),
//                new BankAccount("KYRGYZSTAN ","222222","345"),
//                new BankAccount("DEMIR ","333333","678"),
//                new BankAccount("RSK ","444444","91011")));
//       ;
//        System.out.println( bankAccounts.isEmpty());



// 5
//        Set<BankAccount>bankAccounts = new HashSet<>(Arrays.asList(
//                new BankAccount("OPTIMA ","111111","123"),
//                new BankAccount("KYRGYZSTAN ","222222","345"),
//                new BankAccount("DEMIR ","333333","678"),
//                new BankAccount("RSK ","444444","91011")));
//        Set<BankAccount>bankAccounts1 = new HashSet<>();
//
//        bankAccounts1.addAll(bankAccounts);
//        System.out.println(bankAccounts1);

//        ava Collection: TreeSet Exercises [16 көнүгүүлөр]
//
//        1. Жаңы TreeSet топтомун түзүү үчүн Java программасын жазыңыз, бир нече түстөрдү  кошуп, TreeSet топтомун басып чыгарыңыз.

//        Set<String>integerSet = new TreeSet<>();
//        integerSet.add("grey");
//        integerSet.add("black");
//        integerSet.add("red");
//        System.out.println(integerSet);
//
//        2. TreeSet топтомундагы бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
//        Set<Integer> integers = new TreeSet<>();
//        integers.add(4);
//        integers.add(24);
//        integers.add(0);
//        System.out.println(integers);
//
//        3. Белгиленген TreeSet топтомунун бардык элементтерин башка TreeSet топтомуна кошуу үчүн Java программасын жазыңыз.
//        Set<Integer> integers = new TreeSet<>();
//        integers.add(24);
//        integers.add(0);
//        integers.add(5);
//        integers.add(2);
//        Set<Integer> integerSet = new TreeSet<>();
//        integerSet.addAll(integers);
//        System.out.println(integerSet);
//
//        4. Берилген TreeSet топтомундагы элементтердин тескери иреттүү көрүнүшүн түзүү үчүн Java программасын жазыңыз.
//        TreeSet<Integer> integers = new TreeSet<>();
//        integers.add(33);
//        integers.add(34);
//        integers.add(6);
//        integers.add(4);
//        System.out.println(integers.descendingSet());

//
//        5. TreeSet топтомундагы биринчи жана акыркы элементтерди алуу үчүн Java программасын жазыңыз.

//        TreeSet<Integer>integers1 = new TreeSet<>();
//        integers1.add(223);
//        integers1.add(90);
//        integers1.add(44);
//        integers1.add(9);
//        System.out.println(integers1.first());
//        System.out.println(integers1.last());


//        6. TreeSet тизмегин башка TreeSet топтомуна клондоо(clone) үчүн Java программасын жазыңыз.
        // Бош TreeSet түзүү
//        TreeSet<String> strings = new TreeSet<>();
//        strings.add("Hello");
//        strings.add("Java");
//        strings.add("Bye");
//        System.out.println(strings);
//
//        TreeSet clone = new TreeSet();
//        clone = (TreeSet) strings.clone();
//        System.out.println(clone);


//
//        7. TreeSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
//        TreeSet<String> strings = new TreeSet<>();
//        strings.add("Java");
//        strings.add("c#");
//        strings.add("c++");
//        strings.add("Python");
//        System.out.println(strings.size());
//
//        8. Эки TreeSet топтомун салыштыруу үчүн Java программасын жаз.
//        TreeSet<Integer> integers1 = new TreeSet<>();
//        integers1.add(43);
//        integers1.add(44);
//        integers1.add(2);
//        TreeSet<Integer> integers2 = new TreeSet<>();
//        integers2.add(4);
//        integers2.add(43);
//        integers2.add(2);
//        Iterator<Integer>iterator = integers1.iterator();
//        Iterator<Integer>integer2 = integers2.iterator();
//        boolean trueOfFAlse = true;
//        while (iterator.hasNext() && integer2.hasNext()) {
//            if (!(iterator.next() == integer2.next())) {
//                trueOfFAlse = false;
//            }
//            System.out.println(trueOfFAlse);
//        }

//
//        9. Tree топтомундагы 7ден аз сандарды табуу үчүн Java программасын жаз.
//        TreeSet<Integer>integers = new TreeSet<>();
//        integers.add(4);
//        integers.add(44);
//        integers.add(6);
//        integers.add(3);
//        for (Integer integer:integers) {
//            if (integer < 7) {
//                System.out.println(integer);
//            }
//        }


//
//        10. Берилген элементтен чоң же ага барабар болгон TreeSet жыйындысынын элементин алуу үчүн Java программасын жазыңыз.


//        TreeSet<Integer>integers = new TreeSet<>();
//        integers.add(81);
//        integers.add(83);
//        integers.add(86);
//        integers.add(44);
//        integers.add(4);
//
//        ArrayList<Integer>integers1 = new ArrayList<>();
//        integers1.addAll(integers);
//        System.out.println(integers1);
//
//
//        for (Integer integer:integers) {
//            if(integers1.get(1) <= integer){
//                System.out.print(integer+" ");
//            }
//
//        }
//
//        11. Берилген элементтен кичине же ага барабар болгон TreeSet топтомундагы элементти алуу үчүн Java программасын жазыңыз.
//        TreeSet<Integer> integers = new TreeSet<>();
//        integers.add(43);
//        integers.add(3);
//        integers.add(45);
//        integers.add(5);
//        for (Integer integer :integers) {
//            if (integer < 44) {
//                System.out.println(integer);
//            }
//        }

//
//        12. TreeSet топтомунун биринчи элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
//        TreeSet<Integer>integers1 = new TreeSet<>();
//        integers1.add(1);
//        integers1.add(33);
//        integers1.add(42);
//        integers1.add(3);
//        integers1.add(45);
//
//        ArrayList<Integer>integers = new ArrayList<>();
//        integers.addAll(integers1);
//        System.out.println(integers);
//        System.out.println(integers.get(0));
//        System.out.println(integers.remove(0));
//        System.out.println(integers);
//
//        13. TreeSet топтомунун акыркы элементин алуу жана алып салуу үчүн Java программасын жазыңыз.

//        TreeSet<String>strings = new TreeSet<>();
//        strings.add("Altynbek");
//        strings.add("Baytyik");
//        strings.add("Yryskeldi");
//        strings.add("Keldibek");
//        ArrayList<String>strings1 = new ArrayList<>();
//        strings1.addAll(strings);
//        System.out.println(strings1);

//
//        14. Берилген элементти TreeSet жыйындысынан алып салуу үчүн Java программасын жазыңыз.
//        TreeSet<Integer>integers = new TreeSet<>();
//        integers.add(4);
//        integers.add(0);
//        integers.add(6);
//        integers.add(5);
//        integers.remove(4);
//        System.out.println(integers);
//

    }

}