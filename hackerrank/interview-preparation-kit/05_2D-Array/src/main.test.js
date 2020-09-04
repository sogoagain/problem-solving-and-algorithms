const hourglassSum = require('./main');

test('hourglassSum', () => {
    // eslint-disable-next-line no-sparse-arrays
    const arr = [
        [1, 1, 1, 0, 0, 0],
        [0, 1, 0, 0, 0, 0],
        [1, 1, 1, 0, 0, 0],
        [0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0],
        [0, 0, 0, 0, 0, 0],,
    ];
    const max = hourglassSum(arr);
    expect(max).toBe(7);
});
