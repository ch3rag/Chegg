public class StudentAssignment {
	public static void main(String[] args) {
		DoubleArraySeq seq = new DoubleArraySeq();
		int answer = 1;
		int size = 0;
		double current = 0.0;
		String content = "";
		boolean isCurrent = false;
		int capacity;

		size = seq.size();
		System.out.printf("01. Size = %d\n", size);
		// 1. Size = 0
		// Explanation: There are no elements in the sequence.

		capacity = seq.getCapacity();
		System.out.printf("02. Capacity = %d\n", capacity);
		// 2. Capacity = 10
		// Explanation: The default capacity of a DoubleArraySeq is 10.

		isCurrent = seq.isCurrent();
		System.out.printf("03. isCurrent = %s\n", isCurrent);
		// 3. isCurrent = False
		// Explanation: There is no current element in the sequence at the moment.

		if (isCurrent) {
			current = seq.getCurrent();
		}
		System.out.printf("04. Current = %.1f\n", current);
		// 4. Current = 0.0
		// Explanation: Since isCurrent is False, the if block never executes and current value remains 0.0.


		content = seq.toString();
		System.out.printf("05. Content = %s\n", content);
		// 5. Content = <>
		// Explanation: For empty sequences, toString() returns <>.
	
		seq.trimToSize();
		capacity = seq.getCapacity();
		System.out.printf("06. Capacity = %d\n", capacity);
		// 6. Capacity = 0
		// Explanation: Since the size of DoubleArraySeq is 0, trimToSize() will reduce it's capacity to 0.
		

		seq.ensureCapacity(5);
		capacity = seq.getCapacity();
		System.out.printf("07. Capacity = %d\n", capacity);
		// 7. Capacity = 5
		// Explanation: ensureCapacity() will change the capacity of DoubleArraySeq to 5.

		seq.addAfter(1.1);
		content = seq.toString();
		System.out.printf("08. Content = %s\n", content);
		// 8. Content = <[1.1]>
		// Explanation: Since the sequence was empty, addAfter() adds 1.1 at the end and makes it current element.

		size = seq.size();
		System.out.printf("09. Size = %d\n", size);
		// 9. Size = 1
		// Explanation: There is currently one item in the sequence.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("10. Current = %.1f\n", current);
		// 10. Current = 1.1
		// Explanation: 1.1 is the current element which was added by addAfter() at step - 8.

		seq.addBefore(2.2);
		content = seq.toString();
		System.out.printf("11. Content = %s\n", content);
		// 11. Content = <[2.2], 1.1>
		// Explanation: addBefore() adds 2.2 before 1.1 and makes it the new current element.

		size = seq.size();
		System.out.printf("12. Size = %d\n", size);
		// 12. Size = 2
		// Explanation: There are currently two items in the sequence.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("13. Current = %.1f\n", current);
		// 13. Current = 2.2
		// Explanation: 2.2 is the current element which was added by addBefore() at step - 11.

		seq.addAfter(3.3);
		content = seq.toString();
		System.out.printf("14. Content = %s\n", content);
		// 14. Content = <2.2, [3.3], 1.1>
		// Explanation: addAfter() adds 3.3 after 2.2 and makes it the new current element.

		size = seq.size();
		System.out.printf("15. Size = %d\n", size);
		// 15. Size = 3
		// Explanation: There are currently three items in the sequence.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("16. Current = %.1f\n", current);
		// 16. Current = 3.3
		// Explanation: 3.3 is the current element which was added by addAfter() at step - 14.

		seq.advance();
		content = seq.toString();
		System.out.printf("17. Content = %s\n", content);
		// 17. Content = <2.2, 3.3, [1.1]>
		// Explanation: advance() advances the current element from 3.3 to 1.1.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("18. Current = %.1f\n", current);
		// 18. Current = 1.1
		// Explanation: 1.1 is the current element after the advancement by step - 17.

		seq.advance();
		content = seq.toString();
		System.out.printf("19. Content = %s\n", content);
		// 19. Content = <2.2, 3.3, 1.1>
		// Explanation: There is no element after 1.1, so advancing the pointer will result it no current element.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("20. Current = %.1f\n", current);
		// 20. Current = 1.1
		// Explanation: Since there is no current element, if block never executes and current retains it's old value of 1.1.

		seq.addBefore(4.4);
		content = seq.toString();
		System.out.printf("21. Content = %s\n", content);
		// 21. Content = <[4.4], 2.2, 3.3, 1.1>
		// Explanation: addBefore() adds 4.4 at the beginning of the sequence and makes it the current element.

		size = seq.size();
		System.out.printf("22. Size = %d\n", size);
		// 22. Size = 4
		// Explanation: There are currently four items in the sequence.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("23. Current = %.1f\n", current);
		// 23. Current = 4.4
		// Explanation: Current element is 4.4 which was added by addBefore() at step - 21.

		seq.advance();
		content = seq.toString();
		System.out.printf("24. Content = %s\n", content);
		// 24. Content = <4.4, [2.2], 3.3, 1.1>
		// Explanation: advance() advances the current element from 4.4 to 2.2.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("25. Current = %.1f\n", current);
		// 25. Current = 2.2
		// Explanation: 2.2 is the current element after the advancement by step - 24.

		seq.advance();
		content = seq.toString();
		System.out.printf("26. Content = %s\n", content);
		// 26. Content = <4.4, 2.2, [3.3], 1.1>
		// Explanation: advance() advances the current element from 2.2 to 3.3.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("27. Current = %.1f\n", current);
		// 27. Current = 3.3
		// Explanation: 3.3 is the current element after the advancement by step - 26.

		seq.advance();
		content = seq.toString();
		System.out.printf("28. Content = %s\n", content);
		// 28. Content = <4.4, 2.2, 3.3, [1.1]>
		// Explanation: advance() advances the current element from 3.3 to 1.1.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("29. Current = %.1f\n", current);
		// 29. Current = 1.1
		// Explanation: 1.1 is the current element after the advancement by step - 28.

		seq.advance();
		content = seq.toString();
		System.out.printf("30. Content = %s\n", content);
		// 30. Content = <4.4, 2.2, 3.3, 1.1>
		// Explanation: There is no element after 1.1, so advancing the pointer will result it no current element.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("31. Current = %.1f\n", current);
		// 31. Current = 1.1
		// Explanation: Since there is no current element, if block never executes and current retains it's old value of 1.1.

		seq.start();
		content = seq.toString();
		System.out.printf("32. Content = %s\n", content);
		// 32. Content = <[4.4], 2.2, 3.3, 1.1>
		// Explanation: start() makes 4.4 as the new current element.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("33. Current = %.1f\n", current);
		// 33. Current = 4.4
		// Explanation: 4.4 is the current element as set by start() at step - 32.


		seq.advance();
		content = seq.toString();
		System.out.printf("34. Content = %s\n", content);
		// 34. Content = <4.4, [2.2], 3.3, 1.1>
		// Explanation: 3.3 is the current element after the advancement by step - 33.

		seq.removeCurrent();
		content = seq.toString();
		System.out.printf("35. Content = %s\n", content);
		// 35. Content = <4.4, [3.3], 1.1>
		// Explanation: 2.2 was removed as it was the current element. The element after it, i.e., 3.3 is the current element.

		size = seq.size();
		System.out.printf("36. Size = %d\n", size);
		// 36. Size = 3
		// Explanation: There are currently three items in the sequence.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("37. Current = %.1f\n", current);
		// 37. Current = 3.3
		// Explanation: 3.3 is the new current after the removal of 2.2 at step - 35.

		seq.removeCurrent();
		content = seq.toString();
		System.out.printf("38. Content = %s\n", content);
		// 38. Content = <4.4, [1.1]>
		// Explanation: 3.3 was removed as it was the current element. The element after it, i.e., 1.1 is the current element.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("39. Current = %.1f\n", current);
		// 39. Current = 1.1
		// Explanation: 1.1 is the new current after the removal of 3.3 at step - 38.

		seq.removeCurrent();
		content = seq.toString();
		System.out.printf("40. Content = %s\n", content);
		// 40. Content = <4.4>
		// Explanation: 3.3 was removed as it was the current element. 1.1 was last element, so there is no current element.

		if (seq.isCurrent()) {
			current = seq.getCurrent();
		}
		System.out.printf("41. Current = %.1f\n", current);
		// 41. Current = 1.1
		// Explanation: Since there is no current element, if block never executes and current retains it's old value of 1.1.

		content = seq.toString();
		System.out.printf("42. Content = %s\n", content);
		// 42. Content = <4.4>
		// Explanation: No changes done.

		seq.start();
		content = seq.toString();
		System.out.printf("43. Content = %s\n", content);
		// 43. Content = <[4.4]>
		// Explanation: start() makes 4.4 as the new current element.

		seq.removeCurrent();
		content = seq.toString();
		System.out.printf("44. Content = %s\n", content);
		// 44. Content = <>
		// Explanation: 4.4 is removed and sequence is now empty.
	}
}
