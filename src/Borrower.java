import java.util.List;

public interface Borrower {
    String getName();
    String getId();
    List<Resource> getBorrowedResources();
}
