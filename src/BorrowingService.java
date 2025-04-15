public class BorrowingService {
    public void borrowResource(Borrower borrower, Resource resource) {
        if (borrower == null || resource == null) {
            throw new IllegalArgumentException("Student or Resource cannot be null.");
        }

        borrower.getBorrowedResources().add(resource);
        System.out.println(borrower.getName() + " borrowed " + resource.getTitle());
    }

    public void returnResource(Borrower borrower, Resource resource) {
        if (borrower == null || resource == null) {
            throw new IllegalArgumentException("Student or Resource cannot be null.");
        }

        borrower.getBorrowedResources().remove(resource);
        System.out.println(borrower.getName() + " returned " + resource.getTitle() + "\n");
    }
}