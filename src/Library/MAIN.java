package Library;

import java.util.ArrayList;

public class MAIN {
    static ArrayList<Book> list1 = new ArrayList<>();

    static ArrayList<Employee> list2 = new ArrayList<>();

    static ArrayList<Custumer> list3 = new ArrayList<>();

    static ArrayList<Order> list4 = new ArrayList<>();







    public static Book getBookById(long Id){
        Book current = null;
        for(Book b:list1){
           if (b.getId() == Id) {
               current = b;
               break;
            }

        }
        return current;

    }


    public static void main(String[] args) {
        initData();

        String bookInfo =
        String.format("Загальна кількість книг %d на суму %f", getCountOfSoldBooks(), getAllPriceOfAllBooks());
        System.out.println(bookInfo);
        System.out.println();
    }

    public static double getAllPriceOfAllBooks(){
        double price = 0;

        for(Order order : list4){
            price += getPriceOfSoldBooksInOrder(order);
        }
        return price;
    }

    public static double getPriceOfSoldBooksInOrder(Order order){
        double price = 0;

        for(long bookId : order.getOrder()){
            Book book = getBookById(bookId);
            if(book != null){
                price += book.getPrice();
            }
        }
        return price;
    }


    public static int getCountOfSoldBooks(){
        int count = 0;
        for(Order order : list4){
            count += order.getOrder().length;
        }
        return count;
    }

    public static void initData(){
        //_____________________________________________________________________________
        list1.add(new Book(1,"book1","autor1",10,BookGener.HORROR));
        list1.add(new Book(2,"book2","autor2",20,BookGener.HISTORY));
        list1.add(new Book(3,"book3","autor3",30,BookGener.HISTORY));
        list1.add(new Book(4,"book4","autor4",40,BookGener.HISTORY));
        list1.add(new Book(5,"book5","autor5",50,BookGener.FANTASY));
        //_____________________________________________________________________________
        list2.add(new Employee(1,"Tom", 22));
        list2.add(new Employee(2,"Jack", 40));
        list2.add(new Employee(3,"Mark", 27));
        //_____________________________________________________________________________
        list3.add(new Custumer(1,"Alli",20));
        list3.add(new Custumer(2,"John",19));
        list3.add(new Custumer(3,"Misha",15));
        list3.add(new Custumer(4,"Dima",27));
        list3.add(new Custumer(5,"Bogdan",23));
        //_____________________________________________________________________________
        list4.add(new Order(1,2,5, new long[]{1,2}));
        list4.add(new Order(2,1,2, new long[]{3}));
        list4.add(new Order(3,3,1, new long[]{4,5}));
        list4.add(new Order(4,1,4, new long[]{1,2}));
        //_____________________________________________________________________________

    }
}
