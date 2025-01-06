import java.util.PriorityQueue;

class PriorityQueueExample
{
    public static class Student implements Comparable<Student>
    {
        String name;
        int rank;

        Student(String name,int rank)
        {
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2)
        {
            return this.rank - s2.rank;
        }
    }
    public static void main(String arg[])
    {
        PriorityQueue<Student> q = new PriorityQueue<>();

        q.add(new Student("A",12));
        q.add(new Student("B",10));
        q.add(new Student("C",2));
        q.add(new Student("D",4));

        while(!q.isEmpty())
        {
            System.out.println(q.peek().name+" -> "+q.peek().rank);
            q.remove();
        }

    }
}
