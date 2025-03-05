class LL{
      
    Node head; //head of list

    static class Node {
        Pb pb = new Pb();
        String data = pb.returnString();
        Node next;

        /*Constructor for a new node
        Next is initilized as null*/
        Node (String d) {
            data = d;
            next = null;
        
        }
    }

    // Method to insert a new node
    public static LL insert(LL list, String data) {
        // Create a new node with the given data
        Node new_node = new Node(data);
        new_node.next = null;

        /* If linkedlist is empty,
        make the new node the head*/ 
        if(list.head == null) {
            list.head = new_node;
        } else {
            
            /* iterate over the list until next is null
            then insert new_node there */
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            
            // insert the new_node at the last node
            last.next = new_node;
        }

        return list;
    }

    // Method to delete a node in the LinkedList by POSITION
    public static LL deleteAtPosition(LL list, int index)
    {
        // Store head node
        Node currentNode = list.head;
        Node prev = null;

        //
        // CASE 1:
        // If index is 0, then head node itself is to be
        // deleted

        if (index == 0 && currentNode != null) {
            list.head = currentNode.next; // Changed head

            // Display the message
            System.out.println((index + 1) + " position element deleted");

            // Return the updated List
            return list;
        }
       
        // The counter
        int counter = 0;

        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currentNode.next
        while (currentNode != null) {

            if (counter == index) {
                // Since the currentNode is the required
                // position Unlink currentNode from linked list
                prev.next = currentNode.next;

                // Display the message
                System.out.println(index + " position element deleted");
                break;
            }else {
                // If current position is not the index
                // continue to next node
                prev = currentNode;
                currentNode = currentNode.next;
                counter++;
            }
        }

        // If the position element was found, it should be
        // at currentNode Therefore the currNode shall not be
        // null
        
        // In this case, the currNode should be null
        if (currentNode == null) {
            // Display the message
            System.out.println(index + " position element not found");
        }

        // return the List
        return list;
    }
    
    public static void printList(LL list) {
        Node currentNode = list.head;

        //Iterate over all list data
        while(currentNode != null) {
            System.out.print(currentNode.data);

            //switch to the next node
            currentNode = currentNode.next;
        }
    }    
}