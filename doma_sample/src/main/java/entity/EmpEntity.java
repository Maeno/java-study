package entity;

import org.seasar.doma.*;

/**
 */
@Entity
@Table(name = "EMP")
public class EmpEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(sequence="EMP_SEQ")
    public Integer id;

    public Integer empno;

    public String ename;

    public Integer deptno;

    public String dname;

    @Override
    public String toString() {
        return "EmpEntity{" +
                "id=" + id +
                ", empno=" + empno +
                ", ename='" + ename + '\'' +
                ", deptno=" + deptno +
                ", dname='" + dname + '\'' +
                '}';
    }
}
