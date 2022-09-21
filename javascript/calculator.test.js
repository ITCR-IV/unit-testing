const Calculator = require('./calculator');

test('adds 1 + 2 to equal 3', () => {
	calc = new Calculator;
  expect(calc.add(1, 2)).toBe(3);
});
