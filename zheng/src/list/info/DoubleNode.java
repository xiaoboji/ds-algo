package list.info;

/**
 * @program: ds-algo
 * @description: 双向节点
 * @author: xiaoboji
 * @create: 2020-09-08 23:14
 */
public class DoubleNode {
  public int data;
  public DoubleNode next;
  public DoubleNode prior;

  public DoubleNode(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public DoubleNode getPrior() {
    return prior;
  }

  public void setPrior(DoubleNode prior) {
    this.prior = prior;
  }

  public DoubleNode getNext() {
    return next;
  }

  public void setNext(DoubleNode next) {
    this.next = next;
  }
}
