package com.deepak.batch4119.sb.otom.SBBatch411911HM;
import com.deepak.batch4119.sb.otom.SBBatch411911HM.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.deepak.batch4119.sb.otom.SBBatch411911HM.repository.PersonRepository;
@SpringBootApplication
public class SbBatch411911HmApplication implements CommandLineRunner{
@Autowired
PersonRepository pr;
public static void main(String[] args) {
SpringApplication.run(SbBatch411911HmApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
Person p1 = new Person("Deepak","Haryana");
Person p2 = new Person("Harinder","Delhi");
Adhaar a1 = new Adhaar(12345);
Adhaar a2 = new Adhaar(45678);
p1.setAdha(a1);
p2.setAdha(a2);
pr.save(p1);
pr.save(p2);
}
}
