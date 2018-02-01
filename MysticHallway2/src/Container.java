public class Container extends Item {

    // Change line 4 so that a container is closed by default
    private boolean isOpen = false;
    private Item contents = new Item();

    public Container () {
        super();
    }

    public Container(String description, int weight) {
        super(description, weight);
    }

    public void setContents(Item newContents) {
        contents = newContents;
    }

    public Item getContents() {
        return contents;
    }
    
    public boolean isOpen() {
        if(isOpen) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isEmpty() {
        return (this.contents == null);
    }
    
    @Override
    public void interact() {
        if(this.isOpen()) {
            this.isOpen = false;
        } else {
            this.isOpen = true;
        }
    }
    
    @Override
    public String getDescription() {
        // Delete line 39 and replace it with the following logic:
        // If the container is closed, return "closed [description]"
        // If the container is empty, return "empty [description]"
        // If the container is not empty, return "[description] containing a [contents description]"
        if(this.isOpen && this.contents == null) {
            return "empty " + super.getDescription();
        } else if (this.isOpen) {
            return super.getDescription() + " containing a " + this.contents.getDescription();
        } else {
            return "closed " + super.getDescription();
        }
    }
    
    @Override
    public int getWeight() {
        // Delete line 47 and replace it with the following logic:
        // If the container is empty, return the weight
        // If the container is not empty, return the sum of the weight of the container and the contents
        if (this.contents == null) {
            return this.getWeight();
        } else {
            return (int)(super.getWeight() + this.contents.getWeight());
        }
    }
    
}
