// Complete the checkMagazine function below.
function checkMagazine(magazine, note) {
    const magazineDic = new Map();
    const noteDic = new Map();

    for (const word of magazine) {
        let count = 1;
        if(magazineDic.has(word)) {
            count = magazineDic.get(word) + 1;
        }
        magazineDic.set(word, count);
    }

    for (const word of note) {
        let count = 1;
        if(noteDic.has(word)) {
            count = noteDic.get(word) + 1;
        }
        noteDic.set(word, count);
    }

    for (let [word, count] of noteDic) {
        if(!magazineDic.get(word)) {
            return 'No';
        }

        if(magazineDic.get(word) < count) {
            return 'No';
        }
    }

    return 'Yes';
}

module.exports = checkMagazine;
