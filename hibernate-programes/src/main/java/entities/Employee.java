package entities;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "Employee")
@DynamicUpdate
public class Employee {
    @Id
    @Column(name = "employee_id")
	/*@GeneratedValue(strategy=GenerationType.AUTO, generator = "empId_generator")
	@SequenceGenerator(name = "empId_generator", initialValue = 2,allocationSize = 2,sequenceName = "empId_seq")*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   /* @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empId_generator")
    @SequenceGenerator(name = "empId_generator", initialValue = 1, allocationSize = 1, sequenceName = "empId_seq")*/
    private Integer employeeId;

    @Column(name = "employee_name", length = 100, nullable = false)
    private String employeeName;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "date_of_joing")
    private Date doj;

   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private  Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/
    // private Address homeAddress;

   /* @Embedded
    @AttributeOverrides(value = {
            @AttributeOverride(column = @Column(name = "office_Street_name", length = 50), name = "street"),
            @AttributeOverride(column = @Column(name = "office_City", length = 20), name = "city"),
            @AttributeOverride(column = @Column(name = "office_State", length = 20), name = "state"),
            @AttributeOverride(column = @Column(name = "office_PinCode", length = 6), name = "pincode")
    })*/
    //private Address officeAddress;


    @Column(name = "salary")
    private Long salary;

   /* @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "Address", joinColumns = @JoinColumn(name = "employee_id"))
    @GenericGenerator(name = "sequence_gen", strategy = "sequence")
    @CollectionId(columns = { @Column(name = "Add_Id") }, generator = "sequence_gen", type = @Type(type = "int"))
    private Collection<Address> addressList = new ArrayList<>();

    public Collection<Address> getAddressList() {
        return addressList;
    }


    public void setAddressList(Collection<Address> addressList) {
        this.addressList = addressList;
    }*/

   @OneToMany(cascade = CascadeType.ALL)
   @JoinTable(name = "employee_address_table", joinColumns = @JoinColumn(name = "employee_id"),inverseJoinColumns = @JoinColumn(name = "address_id"))
   private List<Address> addressList = new ArrayList<>();

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    /* public Address getHomeAddress() {
         return homeAddress;
     }

     public void setHomeAddress(Address address) {
         this.homeAddress = address;
     }

     public Address getOfficeAddress() {
         return officeAddress;
     }

     public void setOfficeAddress(Address officeAddress) {
         this.officeAddress = officeAddress;
     }
 */
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email + ", doj="
                + doj + ", salary=" + salary + "]";
    }

}
