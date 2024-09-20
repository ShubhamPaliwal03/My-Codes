strings = ["madam", "god", "civic", "mom", "swims", "rotator", "kayak", "jug"];

const isPalindrome = (string) => {

    for (let i = 0, j = string.length - 1; i < j; i++, j--) {

        if (string[i] !== string[j]) {

            return false;
        }
    }

    return true;
};

const countPalindromes = strings.reduce((count, current) => {

    return isPalindrome(current) ? count + 1 : count;

}, 0);

console.log(countPalindromes);