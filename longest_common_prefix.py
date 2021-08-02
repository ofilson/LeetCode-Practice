def longestCommonPrefix(prev_prefix, new_word):
    if prev_prefix in new_word:
        return prev_prefix
    else:
        new_prefix = prev_prefix
        while(new_prefix not in new_word):
            new_prefix = new_prefix[0: len(new_prefix) - 1]
        return new_prefix

strs = ["flower","flow","flight"]
curr_common_prefix = strs[0]

for i in strs:
    if i != strs[0]:
        curr_common_prefix = longestCommonPrefix(curr_common_prefix, i)

print(curr_common_prefix)