package com.aapog.controller;

import com.aapog.broker.IDomainsBroker;
import com.aapog.entity.Domains;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aapog.broker.IProductBroker;
import com.aapog.entity.Product;
import com.aapog.events.style.SelectedSideBarMenu;

import java.util.List;

@Controller
public class ProductController {


}
