const minimumBribes = require('./main');

test('minimumBribes', () => {
    const max = minimumBribes([2, 1, 5, 3, 4]);
    expect(max).toBe(3);
});
