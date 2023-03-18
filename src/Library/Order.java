package Library;

public class Order {
    private long id;
    private long emplId;
    private long personId;

    private long[] order;

    public Order(long id, long emplId, long personId, long[] order) {
        this.id = id;
        this.emplId = emplId;
        this.personId = personId;
        this.order = order;
    }


    public long[] getOrder() {
        return order;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmplId() {
        return emplId;
    }

    public void setEmplId(long emplId) {
        this.emplId = emplId;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }
}
