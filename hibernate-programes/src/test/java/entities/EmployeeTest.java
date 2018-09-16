package entities;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class EmployeeTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Employee. class)
  .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getEmployeeId() {
    }

    @org.junit.Test
    public void setEmployeeId() {
    }

    @org.junit.Test
    public void getEmployeeName() {
    }

    @org.junit.Test
    public void setEmployeeName() {
    }

    @org.junit.Test
    public void getEmail() {
    }

    @org.junit.Test
    public void setEmail() {
    }

    @org.junit.Test
    public void getDoj() {
    }

    @org.junit.Test
    public void setDoj() {
    }

    @org.junit.Test
    public void getSalary() {
    }

    @org.junit.Test
    public void setSalary() {
    }

}
