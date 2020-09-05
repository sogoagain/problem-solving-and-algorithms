const checkMagazine = require('./main');

test('checkMagazine', () => {
    const magazine = ['apgo', 'clm', 'w', 'lxkvg', 'mwz', 'elo', 'bg', 'elo', 'lxkvg', 'elo', 'apgo', 'apgo', 'w', 'elo', 'bg'];
    const note = ['elo', 'lxkvg', 'bg', 'mwz', 'clm', 'w'];
    const result = checkMagazine(magazine, note);
    expect(result).toBe('Yes');
});
