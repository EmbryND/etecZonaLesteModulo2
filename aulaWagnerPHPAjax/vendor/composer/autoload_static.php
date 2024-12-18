<?php

// autoload_static.php @generated by Composer

namespace Composer\Autoload;

class ComposerStaticInit5c0a9cbbe2b025ad08ef451310677e5a
{
    public static $prefixLengthsPsr4 = array (
        'A' => 
        array (
            'Admin\\AulaWagner\\' => 17,
        ),
    );

    public static $prefixDirsPsr4 = array (
        'Admin\\AulaWagner\\' => 
        array (
            0 => __DIR__ . '/../..' . '/src',
        ),
    );

    public static $classMap = array (
        'Composer\\InstalledVersions' => __DIR__ . '/..' . '/composer/InstalledVersions.php',
    );

    public static function getInitializer(ClassLoader $loader)
    {
        return \Closure::bind(function () use ($loader) {
            $loader->prefixLengthsPsr4 = ComposerStaticInit5c0a9cbbe2b025ad08ef451310677e5a::$prefixLengthsPsr4;
            $loader->prefixDirsPsr4 = ComposerStaticInit5c0a9cbbe2b025ad08ef451310677e5a::$prefixDirsPsr4;
            $loader->classMap = ComposerStaticInit5c0a9cbbe2b025ad08ef451310677e5a::$classMap;

        }, null, ClassLoader::class);
    }
}
