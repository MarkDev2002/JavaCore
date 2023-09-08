package Algorithm_Datastructe.LinkedList;

public class SinglyLinkedList {

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public static void prinLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println("");
                }
            }
        }
    }

    public static int length(Node headNode){
        int count = 0;
        Node currentNode = headNode;
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public static Node addHead(Node headNode, int value) { // thêm phần từ vào head
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addTail(Node headNode, int value) { //thêm phần từ vào cuối mảng
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            lastNode.next = newNode;
        }
        return headNode;
    }


    public static Node addToIndex(Node headNode, int value, int index) { //thêm phần từ vào giữa mảng
        if (index == 0) {
            return addHead(headNode, value);
        } else {
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while (curNode.next != null) {
                count++;
                if (count == index) {
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return headNode;
    }

    public static Node removeHeadNode(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeTailNode(Node headNode) {
        Node lastNode = headNode;
        Node prevNode = null;
        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }
        if (prevNode == null) {
            return null;
        } else {
            prevNode.next = lastNode.next;
        }
        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        // in ra các linked list
        prinLinkedList(n1);
        prinLinkedList(n2);
        prinLinkedList(n3);

        //in ra độ dài của dslk

        prinLinkedList(n1);
        int result = length(n1);
        System.out.println("Độ dài của dslk : " + result);


        // in ra kết quả phần tử đã thêm vào đầu mảng
        prinLinkedList(n1);
        n1 = addHead(n1, 0);
        prinLinkedList(n1);

        // in ra kết quả phần tử đã thêm vào cuối mảng
        prinLinkedList(n1);
        n1 = addTail(n1, 0);
        prinLinkedList(n1);

        //in ra kết quả phần tử đã thêm vào theo index
        prinLinkedList(n1);
        n1 = addToIndex(n1, 0, 2);
        prinLinkedList(n1);

        //in ra kết quả xóa phần tử ở đầu
        prinLinkedList(n1);
        n1 = removeHeadNode(n1);
        prinLinkedList(n1);

        //in ra kết quả phần tử đã xóa ở cuối node

        n1 = removeTailNode(n1);
        prinLinkedList(n1);


        n1 = removeTailNode(n1);
        prinLinkedList(n1);


        n1 = removeTailNode(n1);
        prinLinkedList(n1);


    }
}
