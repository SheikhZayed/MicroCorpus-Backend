package me.ashif.microcorpus.dao;

import me.ashif.microcorpus.beans.Collection;
import me.ashif.microcorpus.beans.Customer;

/*
 * Developed by Ashif Ismail
 * Associate Software Engineer,TechJini Solutions
 * www.ashif.me
 * admin@ashif.me
 *
 */

public interface CollectionDAO {
    Customer viewCustomer(int id);
    void addCollection(Collection collection);
}
