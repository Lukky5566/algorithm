public class Book {
    private final String title;
    private final String author;
    private final int year;
    private float price;
    private int stock;
    private float discount;

    public Book(String title, String author, int year, float price, int stock) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.stock = stock;
        this.discount = 0; 
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
์
    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price * (1 - discount / 100);
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int a) {
        if (a > 0) {
            stock += a;
            System.out.printf("เพิ่มหนังสือ %d เล่มเข้าสต็อกเรียบร้อย! จำนวนในสต็อกปัจจุบัน: %d เล่ม\n", a, stock);
        } else {
            System.out.println("จำนวนที่เพิ่มต้องมากกว่า 0!");
        }
    }

    public void sell(int a) {
        if (a > 0 && stock >= a) {
            stock -= a;
            float totalPrice = getPrice() * a;
            System.out.printf("ขายหนังสือ %d เล่มเรียบร้อย! รายได้: %.2f บาท\n", a, totalPrice);
        } else if (a > 0) {
            System.out.println("จำนวนหนังสือไม่พอขาย!");
        } else {
            System.out.println("จำนวนที่ขายต้องมากกว่า 0!");
        }
    }

    public void setDiscount(float a) {
        if (a >= 0 && a <= 100) {
            discount = a;
            System.out.printf("ตั้งส่วนลดเป็น %.2f%% เรียบร้อย!\n", discount);
        } else {
            System.out.println("ส่วนลดต้องอยู่ระหว่าง 0 ถึง 100!");
        }
    }

    public void showDetails() {
        System.out.printf("ชื่อหนังสือ: %s, ผู้แต่ง: %s, ปี: %d, ราคา: %.2f บาท, จำนวนในสต็อก: %d เล่ม, ส่วนลด: %.2f%%\n",
                title, author, year, getPrice(), stock, discount);
    }

    public static void main(String[] args) {
        Book myBook = new Book("Java Programming", "John Doe", 2021, 500, 10);

        myBook.showDetails();
        myBook.addStock(5);
        myBook.setDiscount(10);
        myBook.sell(3);
        myBook.showDetails(); 
    }
}