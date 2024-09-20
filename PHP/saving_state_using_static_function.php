<?php

    class StateManager
    {
        private static $state = [];

        public static function setState($key, $value)
        {
            self::$state[$key] = $value;
        }

        public static function getState($key)
        {
            return isset(self::$state[$key]) ? self::$state[$key] : null;
        }

        public static function getAllStates()
        {
            return self::$state;
        }
    }

    // setting the state using static function

    StateManager::setState('user', 'Vishwajeet Singh');
    
    StateManager::setState('email', 'vsnegi@example.com');

    // getting the state using static function

    echo(StateManager::getState('user'));   // output :- Vishwajeet Singh
    print("<br>");
    echo(StateManager::getState('email'));  // output :- vsnegi@example.com
    print("<br>");
    echo(StateManager::getState('number')); // output :- nothing (since null is not printed)

    // getting all the states

    print_r(StateManager::getAllStates());

    // output :- Array([user] => Vishwajeet Singh [email] => vsnegi@example.com)
?>