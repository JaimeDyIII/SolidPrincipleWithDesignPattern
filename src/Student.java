import java.util.ArrayList;
import java.util.List;

public class Student implements Borrower{
    private String id;
    private String name;
    private List<Resource> borrowedResources;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedResources = new ArrayList<>();
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Resource> getBorrowedResources() {
        return borrowedResources;
    }

    public void setBorrowedResources(List<Resource> borrowedResources) {
        this.borrowedResources = borrowedResources;
    }

    @Override
    public String toString() {
        StringBuilder borrowed = new StringBuilder();
        if (borrowedResources.isEmpty()) {
            borrowed.append("No resources borrowed.");
        } else {
            for (Resource resource : borrowedResources) {
                borrowed.append(resource.toString()).append("\n");
            }
        }
        
        return "Student ID: " + id + "\nName: " + name + "\nBorrowed Resources:\n" + borrowed.toString();
    }
}