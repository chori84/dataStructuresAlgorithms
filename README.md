# 다양한 예제로 학습하는 데이터 구조와 알고리즘
## Data Structures and Algorithms Made Easy for Java
- 책 소스와 작성한 소스가 다름

### 3장 연결리스트

- 오탈자
  * p.72
  ```
  while의 조건문에 CLLNode != null -> CLLNode.getNext() != null
  headNode가 null일 경우 분기 처리
  ```
  * p.73
  ```
  LLNode -> CLLNode
  while의 조건문에 currentNode != null 추가 - currentNode가 null 일 때 NullPointerException 발생
  currentNode.setNext(currentNode.getNext()) -> currentNode = currentNode.getNext()
  return headNode
  ```
  * p.75
  ```
  LLNode -> CLLNode
  while의 조건문에 currentNode != null 추가 - currentNode가 null 일 때 NullPointerException 발생
  currentNode.setNext(currentNode.getNext()) -> currentNode = currentNode.getNext()
  return headNode
  ```
  * p.76
  ```
  while 이후 temp.setNext(head); 추가
  노드가 하나 밖에 없을 경우 return null
  return headNode
  ```
  * p.78
  ```
  currentNode.setNext(currentNode.getNext()) -> currentNode = currentNode.getNext()
  노드가 하나 밖에 없을 경우 return null
  return headNode
  ```