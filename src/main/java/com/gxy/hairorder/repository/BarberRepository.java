package com.gxy.hairorder.repository;

import com.gxy.hairorder.entity.Barber;
import com.gxy.hairorder.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author GUO
 * @Classname OrderRepsitory
 * @Description TODO
 * @Date 2021/12/8 19:48
 */
public interface BarberRepository extends JpaRepository<Barber,Long> {
}
