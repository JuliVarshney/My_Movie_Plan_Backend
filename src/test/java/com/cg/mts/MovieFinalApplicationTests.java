package com.cg.mts;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.cg.mts.controller.LoginController;
import com.cg.mts.pojo.Booking;
import com.cg.mts.pojo.Customer;
import com.cg.mts.pojo.Movie;
import com.cg.mts.pojo.Screen;
import com.cg.mts.pojo.Seat;
import com.cg.mts.pojo.Show;
import com.cg.mts.pojo.Theatre;
import com.cg.mts.pojo.Ticket;

@SpringBootTest
class MovieFinalApplicationTests extends AbstractTest {
	@Override
	@BeforeEach
	public void setUp() {
		super.setUp();
	}

	@Autowired
	LoginController loginController;
	}
