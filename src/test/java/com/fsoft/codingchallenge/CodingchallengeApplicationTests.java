package com.fsoft.codingchallenge;

import com.fsoft.codingchallenge.commands.BucketFillCommand;
import com.fsoft.codingchallenge.dtos.drawing.BucketFill;
import com.fsoft.codingchallenge.exceptions.InvalidDrawingComponentException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

class CodingchallengeApplicationTests {

	@Test
	public void givenBucketFillIsNull_when_executeCommand() {
		BucketFill bucketFill = null;
		assertThrows(InvalidDrawingComponentException.class, () -> new BucketFillCommand(bucketFill, null).execute());
	}



}
