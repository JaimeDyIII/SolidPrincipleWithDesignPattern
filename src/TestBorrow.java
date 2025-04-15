public class TestBorrow {
    public static void main(String[] args){
        Borrower student = new Student("22-13456-403", "Random Guy");
        Resource book1 = new Book("Book 1", "Author 1");
        Resource journal1 = new Journal("Journal 1", "Author 2");

        BorrowingService borrowingService = new BorrowingService();

        borrowingService.borrowResource(student, book1);
        borrowingService.borrowResource(student, journal1);

        System.out.println();

        System.out.println(student);

        borrowingService.returnResource(student, book1);
        System.out.println(student);
    }
}