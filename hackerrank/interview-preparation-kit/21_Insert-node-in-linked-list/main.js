// Complete the insertNodeAtPosition function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
function insertNodeAtPosition(head, data, position) {
  let curr = head;
  for (let i = 0; i < position - 1; i++) {
      curr = curr.next;
  }

  const newNode = new SinglyLinkedListNode(data);
  newNode.next = curr.next;
  curr.next = newNode;

  return head;
}
