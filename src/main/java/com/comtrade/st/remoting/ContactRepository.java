/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comtrade.st.remoting;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author radoo
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {

	List<Contact> findByFirstName(String firstName);
}//end ContactRepository
